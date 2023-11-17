package co.uniquindio.edu.quizzwebapp.model.entities.preguntas;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Entity
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder

public class PreguntaCerrada extends Pregunta implements Serializable {

    private Boolean respuesta;

}
