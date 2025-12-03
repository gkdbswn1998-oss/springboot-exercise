package springboot_exercise.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "routine_master")
public class RoutineMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String routineCode;
    private String routineName;
    private int isActive;
}
