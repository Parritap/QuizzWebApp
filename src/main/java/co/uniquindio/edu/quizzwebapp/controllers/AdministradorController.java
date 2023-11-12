package co.uniquindio.edu.quizzwebapp.controllers;

import co.uniquindio.edu.quizzwebapp.dto.ResultadosQuizDTO;
import co.uniquindio.edu.quizzwebapp.serviceImp.AdministradorService;
import co.uniquindio.edu.quizzwebapp.serviceImp.DocenteService;
import co.uniquindio.edu.quizzwebapp.serviceImp.EstudianteService;
import co.uniquindio.edu.quizzwebapp.serviceImp.PresentacionQuizzService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("/administrador")
@CrossOrigin
@AllArgsConstructor
public class AdministradorController {

    private final DocenteService docenteService;
    private final EstudianteService estudianteService;
    private final AdministradorService administradorService;
    private final PresentacionQuizzService presentacionQuizzService;


    @GetMapping("/presentacionQuizz")
    public List<ResultadosQuizDTO> findAll() {

        ArrayList<ResultadosQuizDTO> resultadosQuizDTOS = new ArrayList<>();

        presentacionQuizzService.findAll().forEach(presentacionQuizz -> {

            ResultadosQuizDTO resultadosQuizDTO = new ResultadosQuizDTO(
                    presentacionQuizz.getId().getEstudiante().getNombre(),
                    presentacionQuizz.getCalificacion()
            );

            resultadosQuizDTOS.add(resultadosQuizDTO);

        });

        return resultadosQuizDTOS;
    }

}
