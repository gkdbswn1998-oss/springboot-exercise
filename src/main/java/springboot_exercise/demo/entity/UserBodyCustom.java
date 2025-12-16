package springboot_exercise.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Entity
@Setter
@Getter
@Table(name = "user_body_custom")
public class UserBodyCustom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String bodyName;
    private String unit;
    private String createdAt;
}
