package co.uniquindio.edu.quizzwebapp.controllers;

import co.uniquindio.edu.quizzwebapp.dto.DocenteDTO;
import co.uniquindio.edu.quizzwebapp.model.entities.Docente;
import co.uniquindio.edu.quizzwebapp.model.entities.Estudiante;
import co.uniquindio.edu.quizzwebapp.serviceImp.DocenteService;
import co.uniquindio.edu.quizzwebapp.serviceImp.EstudianteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@AllArgsConstructor
public class LoginController {


    private final DocenteService docenteService;
    private final EstudianteService estudianteService;


    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/docente")
    public void docente(@RequestBody DocenteDTO docente){
        Docente docente1 = Docente.builder()
                .nombre(docente.nombre())
                .correo(docente.correo())
                .password(docente.password())
                .esEstudiante(docente.esEstudiante())
                .build();

        docenteService.save(docente1);
    }

    @GetMapping("/docente")
    public List<Estudiante> getDocente(){
        return estudianteService.findAll();
    }

}
