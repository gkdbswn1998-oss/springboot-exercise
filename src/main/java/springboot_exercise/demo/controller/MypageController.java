package springboot_exercise.demo.controller;

import org.springframework.web.bind.annotation.*;
import springboot_exercise.demo.entity.*;
import springboot_exercise.demo.service.MypageService;

import java.util.List;

@CrossOrigin(origins = "*")
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

    @PostMapping("/mypageExercise")
    public void exerciseCustom(@RequestBody UserExerciseCustom userExerciseCustom) {
        mypageService.exerciseCustom(userExerciseCustom);
    }

    @GetMapping("/mypageExerciseCustom")
    public List<UserExerciseCustom> getExerciseCustom(@RequestParam String email) {
        return mypageService.getExerciseCustom(email);
    }

    @PostMapping("/mypagesave")
    public String postExerciseSave(@RequestBody ExercisePreset exercisePreset) {
        String result = "";
        ExercisePreset a = mypageService.postExercisePreset(exercisePreset);
        if (a != null) {
            result = "success";
        } else {
            result = "fail";
        }
        return result;
    }

    @GetMapping("/getPreset")
    public List<ExercisePreset> getPresetList(@RequestParam String email) {
        return mypageService.getPresetList(email);
    }

    @DeleteMapping("/checkedDelete")
    public void deletedChecked(@RequestParam String email, @RequestParam Long exerciseId) {
        mypageService.deletedChecked(email, exerciseId);
    }

    @GetMapping("/getBodyName")
    public List<BodyMaster> getBodyName() {
        return mypageService.getBodyName();
    }

    @PostMapping("/postBodyNameCustom")
    public void postBodyName(@RequestBody UserBodyCustom userBodyCustom) {
        mypageService.postBodyName(userBodyCustom);
    }

    @GetMapping("/getBodyCustomList")
    public List<UserBodyCustom> getBodyCustomList(@RequestParam String email) {
        return mypageService.getBodyCustomList(email);
    }

    @PostMapping("/postBodyNamePreset")
    public void postBodyNamePreset(@RequestBody UserBodyPreset userBodyPreset) {
        mypageService.postBodyNamePreset(userBodyPreset);
    }

    @DeleteMapping("/checkedCustomDelete")
    public void deletedCustomChecked(@RequestParam String email, @RequestParam Long customId) {
        mypageService.deletedCustomChecked(email, customId);
    }

    @PostMapping("/routineSave")
    public void postRoutineSave(@RequestBody UserRoutinePreset userRoutinePreset) {
        mypageService.postRoutineSave(userRoutinePreset);
    }

    @GetMapping("/routineList")
    public List<UserRoutinePreset> getRoutineList() {
        return mypageService.getRoutineList();
    }

    @GetMapping("/getPresetRoutine")
    public List<UserRoutinePreset> getPresetRoutineList (@RequestParam String email){
        return mypageService.getPresetRoutineList(email);
    }
}
