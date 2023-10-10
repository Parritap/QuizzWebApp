package co.uniquindio.edu.quizzwebapp.model.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;

import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public abstract class Usuario implements Serializable {
    @Id
    private Integer id;
    @UniqueElements
    private String correo;
    private String password;
    private boolean esEstudiante;

}
