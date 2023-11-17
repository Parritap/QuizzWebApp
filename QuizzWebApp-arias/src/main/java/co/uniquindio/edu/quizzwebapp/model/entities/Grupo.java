package co.uniquindio.edu.quizzwebapp.model.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@SuperBuilder
public class Grupo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;

    @Column (unique = true)
    private String nombre;

    @ManyToOne
    private Docente docente;

    @ManyToOne
    private Curso curso;

    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(), inverseJoinColumns = @JoinColumn())
    private List<Estudiante> estudiantes;


    @ManyToMany
    @JoinTable (joinColumns = @JoinColumn (), inverseJoinColumns = @JoinColumn ())
    private List<Bloque> bloques;

}
