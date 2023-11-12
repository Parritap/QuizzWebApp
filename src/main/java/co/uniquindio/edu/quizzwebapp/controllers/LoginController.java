package co.uniquindio.edu.quizzwebapp.controllers;

import co.uniquindio.edu.quizzwebapp.dto.LoginDTO;
import co.uniquindio.edu.quizzwebapp.dto.ResponseLoginDTO;
import co.uniquindio.edu.quizzwebapp.exception.exceptions.LoginValidationException;
import co.uniquindio.edu.quizzwebapp.model.entities.Administrador;
import co.uniquindio.edu.quizzwebapp.model.entities.Docente;
import co.uniquindio.edu.quizzwebapp.model.entities.Estudiante;
import co.uniquindio.edu.quizzwebapp.serviceImp.AdministradorService;
import co.uniquindio.edu.quizzwebapp.serviceImp.DocenteService;
import co.uniquindio.edu.quizzwebapp.serviceImp.EstudianteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@AllArgsConstructor
public class LoginController {


    private final DocenteService docenteService;
    private final EstudianteService estudianteService;
    private final AdministradorService administradorService;

    @PostMapping("/login")
    public ResponseLoginDTO login(@RequestBody LoginDTO loginDTO) {

        if (docenteService.findByCorreoAndPassword(loginDTO.correo(), loginDTO.password()) != null){

            Docente docente = docenteService.findByCorreoAndPassword(loginDTO.correo(), loginDTO.password());
            return new ResponseLoginDTO(
                    docente.getId(),
                    "Docente"
            );

        }


        if (estudianteService.findByCorreoAndPassword(loginDTO.correo(), loginDTO.password()) != null){

            Estudiante estudiante = estudianteService.findByCorreoAndPassword(loginDTO.correo(), loginDTO.password());
            return new ResponseLoginDTO(
                    estudiante.getId(),
                    "Estudiante"
            );

        }

        if (administradorService.findByCorreoAndPassword(loginDTO.correo(), loginDTO.password()) != null){
            Administrador administrador = administradorService.findByCorreoAndPassword(loginDTO.correo(), loginDTO.password());
            return new ResponseLoginDTO(
                    administrador.getId(),
                    "Administrador"
            );
        }


        throw new LoginValidationException("El usuario no existe");

    }


}
