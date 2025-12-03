package springboot_exercise.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot_exercise.demo.entity.ExerciseMaster;
import springboot_exercise.demo.entity.RoutineMaster;
import springboot_exercise.demo.service.RoutineMasterService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class RoutineMasterController {

    private final RoutineMasterService routineMasterService;

    public RoutineMasterController(RoutineMasterService routineMasterService) {
        this.routineMasterService = routineMasterService;
    }

    @GetMapping("/mypageExercise")
    public List<RoutineMaster> routine(){
        return routineMasterService.routine();

    }
}
