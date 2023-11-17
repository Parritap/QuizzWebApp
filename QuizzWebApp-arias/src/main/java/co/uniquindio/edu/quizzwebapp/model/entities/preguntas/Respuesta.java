package co.uniquindio.edu.quizzwebapp.model.entities.preguntas;



import jakarta.persistence.*;
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
public class Respuesta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private SeleccionMultiple pregSeleccionMultiple;
    private String contenido;
    private Boolean esCorrecta;
}
