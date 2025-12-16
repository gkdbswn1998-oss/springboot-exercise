package springboot_exercise.demo.service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
import springboot_exercise.demo.dto.ExercisePresetDto;
import springboot_exercise.demo.entity.ExercisePreset;
import springboot_exercise.demo.repository.ExercisePresetRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecordService {

    private final ExercisePresetRepository exercisePresetRepository;

    public List<ExercisePresetDto> getExercisePresetList(String email){
        return exercisePresetRepository.findPresetWithNamesByEmail(email);

    }
}
