package co.uniquindio.edu.quizzwebapp.model.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter


public class PresentacionQuizzID implements Serializable {

    @OneToOne
    private Estudiante estudiante;

    @OneToOne
    private Quizz quizz;
}
