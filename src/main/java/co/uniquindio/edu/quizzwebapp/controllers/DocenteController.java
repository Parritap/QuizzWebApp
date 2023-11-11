package co.uniquindio.edu.quizzwebapp.controllers;

import co.uniquindio.edu.quizzwebapp.dto.ResultadosQuizDTO;
import co.uniquindio.edu.quizzwebapp.model.entities.Quizz;
import co.uniquindio.edu.quizzwebapp.serviceImp.AdministradorService;
import co.uniquindio.edu.quizzwebapp.serviceImp.DocenteService;
import co.uniquindio.edu.quizzwebapp.serviceImp.EstudianteService;
import co.uniquindio.edu.quizzwebapp.serviceImp.PresentacionQuizzService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/docente")
@CrossOrigin
@AllArgsConstructor
public class DocenteController {

    private final DocenteService docenteService;
    private final EstudianteService estudianteService;
    private final AdministradorService administradorService;
    private final PresentacionQuizzService presentacionQuizzService;


    //METODO DE ANUBIS
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

    //Metodo de Alejandro

    /**
     * Metodo que permite obtener el promedio de todos los quizz
     * que un docente ha realizado
     *
     * @param idDocente id del docente que se desea obtener el promedio de sus quizz
     * @return List<PromedioQuizzDTO> que contiene el promedio de los quizz de un profesor
     */

    @GetMapping("/promedioQuizz")

    public List<ResultadosQuizDTO> promedioQuizz(@PathVariable Integer idDocente) {

        ArrayList<ResultadosQuizDTO> resultadosQuizDTOS = new ArrayList<>();
        ArrayList<Quizz> listQuizzAux = new ArrayList<>();
        presentacionQuizzService.findAll().forEach(presentacionQuizz -> {
            presentacionQuizz.getId().getQuizz()

        });
        return resultadosQuizDTOS;
    }


}
