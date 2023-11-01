package co.uniquindio.edu.quizzwebapp.model.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
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

    @NotNull
    @UniqueElements
    private String correo;

    @NotNull
    private String password;

    private boolean esEstudiante;
}
