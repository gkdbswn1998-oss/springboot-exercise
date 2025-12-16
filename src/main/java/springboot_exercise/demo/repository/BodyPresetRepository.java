package springboot_exercise.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot_exercise.demo.entity.UserBodyPreset;

@Repository
public interface BodyPresetRepository extends JpaRepository <UserBodyPreset, Long> {

}
