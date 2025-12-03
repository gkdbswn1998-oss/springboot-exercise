package springboot_exercise.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springboot_exercise.demo.entity.ExerciseMaster;
import springboot_exercise.demo.service.MypageService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/mypage")
public class MypageController {

    private final MypageService mypageService;

    public MypageController(MypageService mypageService) {
        this.mypageService = mypageService;
    }

    @GetMapping("/mypageExercise")
    public List<ExerciseMaster> controllerExercise() {
        return mypageService.serviceExercise();
    }
}
