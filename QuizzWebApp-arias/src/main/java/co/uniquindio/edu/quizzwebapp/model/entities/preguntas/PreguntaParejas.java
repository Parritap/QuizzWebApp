package co.uniquindio.edu.quizzwebapp.model.entities.preguntas;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class PreguntaParejas  extends Pregunta implements Serializable {

    private List<SeleccionMultiple> listaSelectMultiple;
}
