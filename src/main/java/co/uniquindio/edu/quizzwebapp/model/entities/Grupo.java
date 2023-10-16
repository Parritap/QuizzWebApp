package co.uniquindio.edu.quizzwebapp.model.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.validator.constraints.UniqueElements;

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
    @Column (name = "id_grupo")
    @EqualsAndHashCode.Include
    private Integer id;

    @UniqueElements
    private String nombre;

    @ManyToOne
    @JoinColumn (name = "id_docente")
    private Docente docente;

    @ManyToOne
    @JoinColumn (name = "id_curso")
    private Curso curso;

    @ManyToMany
    @JoinTable(name = "grupo_Estudiante", joinColumns = @JoinColumn(name = "grupo_id"), inverseJoinColumns = @JoinColumn(name = "estudiante_id"))
    private List<Estudiante> estudiantes;


    @ManyToMany
    @JoinTable (name = "horario", joinColumns = @JoinColumn (name = "id_grupo"), inverseJoinColumns = @JoinColumn (name = "id_clase"))
    private List<Clase> clases;

}
