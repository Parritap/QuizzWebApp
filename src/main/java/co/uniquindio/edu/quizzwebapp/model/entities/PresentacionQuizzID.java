package co.uniquindio.edu.quizzwebapp.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter


public class PresentacionQuizzID implements Serializable {

    @OneToOne
    @JoinColumn(name = "id_usuario")
    private Estudiante estudiante;

    @OneToOne
    @JoinColumn (name = "id_quizz")
    private Quizz quizz;
}
