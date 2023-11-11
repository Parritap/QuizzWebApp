package co.uniquindio.edu.quizzwebapp.serviceImp;

import co.uniquindio.edu.quizzwebapp.model.entities.Administrador;
import co.uniquindio.edu.quizzwebapp.repositories.AdministradorRepository;
import co.uniquindio.edu.quizzwebapp.service.AdministradorServiceI;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AdministradorService implements AdministradorServiceI {

    private final AdministradorRepository administradorRepository;



    public Administrador findByCorreoAndPassword(String correo, String password) {
        return administradorRepository.findByCorreoAndPassword(correo, password);
    }


}
