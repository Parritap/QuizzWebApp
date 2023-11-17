package co.uniquindio.edu.quizzwebapp.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Getter
@Setter
public class PresentacionQuizzID implements Serializable {

    private static final long serialVersionUID = 1L;

    @OneToOne
    @PrimaryKeyJoinColumn(name = "estudiante_id") 
    private Estudiante estudiante;

    @OneToOne
    @PrimaryKeyJoinColumn(name = "quizz_id") 
    private Quizz quizz;

     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PresentacionQuizzID that = (PresentacionQuizzID) o;
        return Objects.equals(estudiante, that.estudiante) &&
               Objects.equals(quizz, that.quizz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(estudiante, quizz);
    }
}
