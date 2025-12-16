package springboot_exercise.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "user_exercise_custom")
public class UserExerciseCustom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String exerciseName;
    private int defaultMinutes;
    private LocalDateTime createdAt;
}
