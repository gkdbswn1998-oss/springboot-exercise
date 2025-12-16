package springboot_exercise.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "user_body_preset")
public class UserBodyPreset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String sourceType;
    private int bodyId;
    private int customId;
    private String createdAt;
}
