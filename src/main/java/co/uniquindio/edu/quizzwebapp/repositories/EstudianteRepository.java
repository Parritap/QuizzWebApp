package co.uniquindio.edu.quizzwebapp.repositories;

import co.uniquindio.edu.quizzwebapp.model.entities.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {

    Estudiante findByCorreoAndPassword(String correo, String password);
}
