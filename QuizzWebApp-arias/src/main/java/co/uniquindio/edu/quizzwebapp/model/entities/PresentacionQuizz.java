package co.uniquindio.edu.quizzwebapp.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode (onlyExplicitlyIncluded = true)
public class PresentacionQuizz  implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "estudiante_id") 
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "quizz_id") 
    private Quizz quizz;

    @Max(100)
    private Integer calificacion;



}
