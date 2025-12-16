package springboot_exercise.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot_exercise.demo.entity.BodyMaster;

@Repository
public interface BodyMasterRepository extends JpaRepository <BodyMaster, Long> {

}

