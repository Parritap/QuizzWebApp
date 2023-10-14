package co.uniquindio.edu.quizzwebapp.model.entities.preguntas;


import co.uniquindio.edu.quizzwebapp.model.entities.preguntas.Pregunta;
import co.uniquindio.edu.quizzwebapp.model.entities.preguntas.SeleccionMultiple;
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
    @Column(name = "id_respuesta")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_pregMultiple")
    /*
     NOTA: Las siguiente lineas solo servirían en el caso de haber una relación bidireccional entre las
     las entidades, lo que significa SIEMPRE que existe por fuerza una tabla intermedia entre ella, i.e, dos llaves foreaneas.
     */
    //@JoinTable(name = "res_pregmultiple",
    //        joinColumns = @JoinColumn(name = "id_res"),
    //        inverseJoinColumns = @JoinColumn(name = "id_pregMul"))
    private SeleccionMultiple pregSelecMultiple;

    private String contenido;

    private Boolean esCorrecta;
}
