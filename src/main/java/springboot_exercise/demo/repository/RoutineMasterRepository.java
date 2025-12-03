package springboot_exercise.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot_exercise.demo.entity.RoutineMaster;

public interface RoutineMasterRepository extends JpaRepository<RoutineMaster,String> {
}
