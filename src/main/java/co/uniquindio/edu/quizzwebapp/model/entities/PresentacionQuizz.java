package co.uniquindio.edu.quizzwebapp.model.entities;

import co.uniquindio.edu.quizzwebapp.model.entities.Estudiante;
import co.uniquindio.edu.quizzwebapp.model.entities.Quizz;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
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
    @EqualsAndHashCode.Include
    private Integer id;

    @OneToOne
    @JoinColumn (name = "id_usuario")
    private Estudiante estudiante;

    @OneToOne
    @JoinColumn (name = "id_quizz")
    private Quizz quizz;

    @Max(100)
    private int calificacion;


}
