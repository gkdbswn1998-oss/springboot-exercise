package springboot_exercise.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot_exercise.demo.entity.UserExerciseCustom;

import java.util.List;

@Repository
public interface UserExerciseCustomRepository extends JpaRepository<UserExerciseCustom,Long> {

    List<UserExerciseCustom> findByEmail(String email);
}
