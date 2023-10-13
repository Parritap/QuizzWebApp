package co.uniquindio.edu.quizzwebapp.model.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.validator.constraints.UniqueElements;

import java.io.Serializable;

@Entity
@NoArgsConstructor
@SuperBuilder
@Inheritance (strategy = InheritanceType.JOINED)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public abstract class Usuario implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @Column(name = "id_usuario")
    private Integer id;

    @UniqueElements
    private String correo;

    private String password;

    private boolean esEstudiante;
}
