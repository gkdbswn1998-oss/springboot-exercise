package springboot_exercise.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot_exercise.demo.entity.UserRoutinePreset;

public interface UserRoutineCustomRepository extends JpaRepository <UserRoutinePreset, Long> {

}
