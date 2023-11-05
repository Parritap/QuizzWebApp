package co.uniquindio.edu.quizzwebapp.model.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode (onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class Clase implements Serializable {

    @Id
    private Integer id;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private char dia;
    @ManyToMany (mappedBy = "clases")
    private List<Grupo> grupos;

}
