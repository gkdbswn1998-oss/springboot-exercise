package springboot_exercise.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springboot_exercise.demo.dto.ExercisePresetDto;
import springboot_exercise.demo.entity.ExercisePreset;
import springboot_exercise.demo.service.RecordService;

import java.util.List;

@Controller
@RestController
@RequestMapping("/record")
@CrossOrigin(origins = "*")
public class RecordController {

    private final RecordService recordService;

    public RecordController(RecordService recordService) {
        this.recordService = recordService;
    }

    @GetMapping("/exercise_preset_list")
    public List<ExercisePresetDto> getExercisePresetList(@RequestParam String email){
        return recordService.getExercisePresetList(email);
    }
}
