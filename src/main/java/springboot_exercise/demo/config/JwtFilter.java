package springboot_exercise.demo.config;

import springboot_exercise.demo.jwt.JwtProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;


@Component
@RequiredArgsConstructor
public class JwtFilter extends OncePerRequestFilter {

    private final JwtProvider jwtProvider;

    // ★★ 특정 URL은 필터 제외 ★★
    @Override
    protected boolean shouldNotFilter(HttpServletRequest request) {
        String path = request.getRequestURI();

        return path.startsWith("/auth/login")
                || path.startsWith("/auth/join")
                || path.startsWith("/user/join")
                || "OPTIONS".equalsIgnoreCase(request.getMethod()); // 프리플라이트 요청도 제외
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain)
            throws ServletException, IOException {

        String bearer = request.getHeader("Authorization");

        if (bearer != null && bearer.startsWith("Bearer ")) {
            String token = bearer.substring(7);

            try {
                String email = jwtProvider.validate(token);

                UsernamePasswordAuthenticationToken auth =
                        new UsernamePasswordAuthenticationToken(
                                email,
                                null,
                                Collections.emptyList()
                        );

                SecurityContextHolder.getContext().setAuthentication(auth);

            } catch (Exception e) {
                System.out.println("JWT 검증 실패: " + e.getMessage());
            }
        }

        filterChain.doFilter(request, response);
    }
}
