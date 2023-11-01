package co.uniquindio.edu.quizzwebapp.model.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode (callSuper = true)
@SuperBuilder
public class Estudiante extends Usuario implements Serializable {

    private String nombre;

    @ManyToMany (mappedBy = "estudiantes")
    private List<Grupo> grupos;

}
