package service;

import entity.User;
import jwt.JwtProvider;
import repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final JwtProvider jwtProvider;

    public String login(String email, String password) {

        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("가입된 이메일 없음"));

        if (!user.getPassword().equals(password)) {
            throw new RuntimeException("비밀번호 불일치");
        }

        return jwtProvider.createToken(email);
    }
}
