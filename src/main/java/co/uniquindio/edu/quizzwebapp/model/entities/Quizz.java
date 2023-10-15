package co.uniquindio.edu.quizzwebapp.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode (onlyExplicitlyIncluded = true)
public class Quizz {

    @Id
    @Column (name = "id")
    @EqualsAndHashCode.Include
    private Integer id;

    @NotNull
    private String nombre;
    @NotNull
    private String descripcion;
    private int tiempo;
    @NotNull
    private byte cantidadPreguntas;

    @ManyToOne
    @JoinColumn (name = "id_tema")
    private Tema tema;
    @NotNull
    private String categoria;
    private LocalDateTime fechaYhora_Inicio;
    @NotNull
    private LocalDateTime fechaYHoraFinalizacion;

    @Max(100)
    private int porcentajeCurso;

    //TODO No me acuerdo esto para qué es, leer los requerimientos del sistema de información.
    private int porcenajeUmbral;

}
