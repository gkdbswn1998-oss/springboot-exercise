package springboot_exercise.demo.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import springboot_exercise.demo.entity.*;
import springboot_exercise.demo.repository.*;

import java.util.List;


@Service
@RequiredArgsConstructor
public class MypageService {

    private final ExerciseMasterRepository exerciseMasterRepository;
    private final UserExerciseCustomRepository userExerciseCustomRepository;
    private final ExercisePresetRepository exercisePresetRepository;
    private final BodyMasterRepository bodyMasterRepository;
    private final BodyCustomRepository bodyCustomRepository;
    private final BodyPresetRepository bodyPresetRepository;
    private final UserRoutineCustomRepository userRoutineCustomRepository;
    private final UserRoutinePresetRepository userRoutinePresetRepository;


    public List<ExerciseMaster> serviceExercise() {
        return exerciseMasterRepository.findAll();
    }

    public void exerciseCustom(UserExerciseCustom userExerciseCustom){
        userExerciseCustomRepository.save(userExerciseCustom);
    }

    public List<UserExerciseCustom> getExerciseCustom(String email){
        return userExerciseCustomRepository.findByEmail(email);
    }

    public ExercisePreset postExercisePreset(ExercisePreset exercisePreset){
        ExercisePreset a = exercisePresetRepository.save(exercisePreset);
        return a;
    }

    public List<ExercisePreset> getPresetList(String email){
        return exercisePresetRepository.findByEmail(email);
    }

    @Transactional
    public void deletedChecked(String email,Long exerciseId) {
        exercisePresetRepository.deleteByEmailAndExerciseId(email,exerciseId);
    }

    public List<BodyMaster> getBodyName() {
        return bodyMasterRepository.findAll();
    }

    public void postBodyName(UserBodyCustom userBodyCustom){
        bodyCustomRepository.save(userBodyCustom);
    }

    public List<UserBodyCustom> getBodyCustomList(String email) {
        return bodyCustomRepository.findByEmail(email);
    }

    public void postBodyNamePreset(UserBodyPreset userBodyPreset){
        bodyPresetRepository.save(userBodyPreset);
    }

    @Transactional
    public void deletedCustomChecked(String email,Long customId) {
        exercisePresetRepository.deleteByEmailAndCustomId(email,customId);
    }

    public void postRoutineSave(UserRoutinePreset userRoutinePreset) {
        userRoutineCustomRepository.save(userRoutinePreset);
    }

    public List<UserRoutinePreset> getRoutineList(){
        return userRoutineCustomRepository.findAll();
    }

    public List<UserRoutinePreset> getPresetRoutineList(String email){
        return userRoutinePresetRepository.findByEmail(email);
    }
}
