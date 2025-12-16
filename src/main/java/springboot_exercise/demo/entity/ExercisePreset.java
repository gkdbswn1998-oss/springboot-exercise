package springboot_exercise.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "user_exercise_preset")
public class ExercisePreset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String sourceType;
    private Long exerciseId;
    private Long customId;
    @Transient
    private String exerciseName;
    @Transient
    private String masterName;
    @Transient
    private String customName;

}
