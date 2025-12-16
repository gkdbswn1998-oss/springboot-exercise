package springboot_exercise.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot_exercise.demo.entity.UserRoutinePreset;

import java.util.List;

public interface UserRoutinePresetRepository extends JpaRepository <UserRoutinePreset,Long>{

    List<UserRoutinePreset> findByEmail(String email);
}
