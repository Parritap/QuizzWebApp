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
public class Bloque implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private char dia;
    @ManyToMany (mappedBy = "bloques")
    private List<Grupo> grupos;

}
