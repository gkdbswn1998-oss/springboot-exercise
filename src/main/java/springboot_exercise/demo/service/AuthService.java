package springboot_exercise.demo.service;

import springboot_exercise.demo.entity.User;

import springboot_exercise.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;


    public String login(String email, String password) {

        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("가입된 이메일 없음"));

        if (!user.getPassword().equals(password)) {
            throw new RuntimeException("비밀번호 불일치");
        }

        return email;
    }
}
