package co.uniquindio.edu.quizzwebapp.model.entities;


import jakarta.persistence.*;
import lombok.Builder;
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
@Inheritance (strategy = InheritanceType.JOINED)

public abstract class Pregunta implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_pregunta")
    private Integer id;

    @OneToOne
    private Banco banco;

    //TODO Si descomendo la siguiente linea, Hibernate se queja en consola.
    //@Column (table = "pregunta", name ="es_publica", columnDefinition = "BIT (1) DEFAULT = 0")
    private Boolean esPublica;

    @OneToOne
    private Docente docente;

    /**
     * Tiempo máximo en minutos para presentar el quizz.
     */
    private Integer tiempoMax;

    private Integer porcentaje;
}
