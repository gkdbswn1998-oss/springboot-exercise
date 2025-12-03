package springboot_exercise.demo.controller;

import springboot_exercise.demo.dto.LoginRequest;
import springboot_exercise.demo.dto.TokenResponse;
import springboot_exercise.demo.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<TokenResponse> login(@RequestBody LoginRequest dto) {
        String token = authService.login(dto.getEmail(), dto.getPassword());
        return ResponseEntity.ok(new TokenResponse(token));
    }
}



