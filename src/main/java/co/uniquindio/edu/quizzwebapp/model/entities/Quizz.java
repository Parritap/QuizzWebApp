package co.uniquindio.edu.quizzwebapp.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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

    private String nombre;
    private String descripcion;
    private int tiempo;
    private byte cantidadPreguntas;

    @ManyToOne
    private Tema tema;
    private String categoria;
    private LocalDateTime horaInicio;
    private LocalDateTime fechaYHoraFinalizacion;
    private int porcentajeCurso;
    private int porcenajeUmbral;




}
