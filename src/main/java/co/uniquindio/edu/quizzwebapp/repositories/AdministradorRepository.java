package co.uniquindio.edu.quizzwebapp.repositories;

import co.uniquindio.edu.quizzwebapp.model.entities.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministradorRepository extends JpaRepository<Administrador, Long> {

    Administrador findByCorreoAndPassword(String correo, String password);
}
