package co.uniquindio.edu.quizzwebapp.model.entities.preguntas;


import co.uniquindio.edu.quizzwebapp.model.entities.Banco;
import co.uniquindio.edu.quizzwebapp.model.entities.Docente;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@NotNull
@Inheritance (strategy = InheritanceType.JOINED)

public abstract class Pregunta implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_pregunta")
    @EqualsAndHashCode.Include
    private Integer id;

    @OneToOne
    @JoinColumn (name = "id_banco")
    private Banco banco;

    //TODO Si descomendo la siguiente linea, Hibernate se queja en consola.
    @NotNull
    @Column (name ="es_publica", columnDefinition = "BIT (1) DEFAULT 0 NOT NULL")
    private Boolean esPublica;

    @OneToOne
    @NotNull
    @JoinColumn (name = "id_docente")
    private Docente docente;

    /**
     * Tiempo máximo en minutos para presentar el quizz.
     */
    @Column (columnDefinition = "INT DEFAULT 60") //60 minutos por defecto para solucionar el quizz;
    private Integer tiempoMax = 60;

    @NotNull
    private Integer porcentaje;

    @NotNull
    @Column (columnDefinition = "VARCHAR(500) NOT NULL")
    private String enunciado;
}
