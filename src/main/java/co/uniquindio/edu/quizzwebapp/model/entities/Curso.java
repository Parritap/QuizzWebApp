package co.uniquindio.edu.quizzwebapp.model.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.validator.constraints.UniqueElements;

import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode (onlyExplicitlyIncluded = true)
public class Curso implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;

    @UniqueElements
    private String nombre;
    @Column (name = "syllabus" , columnDefinition = "BLOB")
    private byte[] syllabus;

    @OneToMany (mappedBy = "curso")
    private List<Grupo> grupos;
}
