package co.uniquindio.edu.quizzwebapp.model.entities.preguntas;

import co.uniquindio.edu.quizzwebapp.model.entities.*;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class SeleccionMultiple extends Pregunta implements Serializable {

    @OneToMany (mappedBy = "pregSelecMultiple")
    private List<Respuesta> respuestas;
}
