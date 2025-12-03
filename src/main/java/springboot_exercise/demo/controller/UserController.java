package springboot_exercise.demo.controller;

import springboot_exercise.demo.entity.User;
import springboot_exercise.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;


    @PostMapping("/join")
    public String join(@RequestBody User user) {
        String result = userService.join(user);
        return result;
    }

}
