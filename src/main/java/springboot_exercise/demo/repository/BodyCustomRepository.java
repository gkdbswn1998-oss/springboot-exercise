package springboot_exercise.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot_exercise.demo.entity.UserBodyCustom;

import java.util.List;


public interface BodyCustomRepository extends JpaRepository <UserBodyCustom, Long> {
    List<UserBodyCustom> findByEmail(String email);
}
