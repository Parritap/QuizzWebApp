package co.uniquindio.edu.quizzwebapp.repositories;

import co.uniquindio.edu.quizzwebapp.model.entities.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocenteRepository extends JpaRepository<Docente, Long> {

        Docente findByCorreoAndPassword(String correo, String password);
}
