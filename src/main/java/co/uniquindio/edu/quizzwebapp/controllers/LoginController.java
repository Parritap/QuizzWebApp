package co.uniquindio.edu.quizzwebapp.controllers;

import co.uniquindio.edu.quizzwebapp.dto.DocenteDTO;
import co.uniquindio.edu.quizzwebapp.dto.LoginDTO;
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

    @GetMapping("/login")
    public String login(@RequestBody LoginDTO loginDTO) {

        if (docenteService.findByCorreoAndPassword(loginDTO.correo(), loginDTO.password()) != null)
            return "Existe el docente";
        if (estudianteService.findByCorreoAndPassword(loginDTO.correo(), loginDTO.password()) != null)
            return "Existe el estudiante";
        if (administradorService.findByCorreoAndPassword(loginDTO.correo(), loginDTO.password()) != null)
            return "Existe el administrador";

        return "No existe";
    }


}
