package co.uniquindio.edu.quizzwebapp.controllers;

import co.uniquindio.edu.quizzwebapp.dto.DocenteDTO;
import co.uniquindio.edu.quizzwebapp.model.entities.Docente;
import co.uniquindio.edu.quizzwebapp.serviceImp.DocenteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@AllArgsConstructor
public class LoginController {


    private final DocenteService docenteService;



    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/docente")
    public void docente(@RequestBody DocenteDTO docente){
        System.out.println(docente);
        Docente docente1 = Docente.builder()
                .nombre(docente.nombre())
                .correo(docente.correo())
                .password(docente.password())
                .esEstudiante(docente.esEstudiante())
                .build();

        docenteService.save(docente1);
    }

}
