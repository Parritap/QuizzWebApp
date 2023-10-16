package co.uniquindio.edu.quizzwebapp.model.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode (onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class Clase implements Serializable {

    @Id
    @Column (name = "id_clase")
    private Integer id;


    private LocalTime horaInicio;
    private LocalTime horaFin;

    @ManyToMany (mappedBy = "clases")
    private List<Grupo> grupos;

}
