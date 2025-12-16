package springboot_exercise.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import springboot_exercise.demo.dto.ExercisePresetDto;
import springboot_exercise.demo.entity.ExercisePreset;

import java.util.List;

public interface ExercisePresetRepository extends JpaRepository<ExercisePreset, Long> {
    List<ExercisePreset> findByEmail(String email);
    void deleteByEmailAndExerciseId(String email,Long exerciseId);
    void deleteByEmailAndCustomId(String email,Long customId);

    @Query(value = """
        SELECT uep.*, em.exercise_name AS master_name, uec.exercise_name AS custom_name
        FROM user_exercise_preset uep
        LEFT JOIN exercise_master em ON uep.exercise_id = em.id
        LEFT JOIN user_exercise_custom uec ON uep.custom_id = uec.id
        WHERE uep.email = :email
        """, nativeQuery = true)
    List<ExercisePresetDto> findPresetWithNamesByEmail(String email);

}

