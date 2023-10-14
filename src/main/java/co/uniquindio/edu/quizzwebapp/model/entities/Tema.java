package co.uniquindio.edu.quizzwebapp.model.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.validator.constraints.Normalized;

import java.io.Serializable;

@Entity
@NoArgsConstructor
@SuperBuilder
@Getter
@Setter
@EqualsAndHashCode (onlyExplicitlyIncluded = true)
public class Tema implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_tema")
    @EqualsAndHashCode.Include
    private Integer id;

    @Column (columnDefinition = "varchar (500)")
    private String conteido;
}
