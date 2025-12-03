package springboot_exercise.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import springboot_exercise.demo.entity.ExerciseMaster;
import springboot_exercise.demo.repository.ExerciseMasterRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MypageService {

    private final ExerciseMasterRepository exerciseMasterRepository;


    public List<ExerciseMaster> serviceExercise() {
        return exerciseMasterRepository.findAll();
    }

}
