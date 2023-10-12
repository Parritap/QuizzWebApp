package co.uniquindio.edu.quizzwebapp.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode (callSuper = true)
@SuperBuilder
public class Estudiante extends Usuario implements Serializable {

    private String nombre;
}
