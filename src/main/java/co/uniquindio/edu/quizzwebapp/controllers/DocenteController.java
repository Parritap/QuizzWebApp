package co.uniquindio.edu.quizzwebapp.controllers;

import co.uniquindio.edu.quizzwebapp.dto.PromedioQuizzDTO;
import co.uniquindio.edu.quizzwebapp.dto.ResultadosQuizDTO;
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

    //Metodo de Alejandro

    /**
     * Metodo que permite obtener el promedio de todos los quizz
     * que un docente ha realizado
     *
     * @param idDocente id del docente que se desea obtener el promedio de sus quizz
     * @return List<PromedioQuizzDTO> que contiene el promedio de los quizz de un profesor
     */

    @GetMapping("/promedioQuizz/{idDocente}")

    public List<PromedioQuizzDTO> promedioQuizz(@PathVariable Long idDocente) {

        ArrayList<PromedioQuizzDTO> resultadosQuizDTOS = new ArrayList<>();



        docenteService.findById(idDocente).getQuizzs().forEach(quizz -> {

            PromedioQuizzDTO resultadosQuizDTO = new PromedioQuizzDTO(
                    quizz.getNombre(),
                    obtenerPromedioQuizz(quizz.getId())
            );

            resultadosQuizDTOS.add(resultadosQuizDTO);

        });
        return resultadosQuizDTOS;
    }


    /**
     * Metodo que recibe el id de un quizz y retorna el promedio de las calificaciones
     * @param id id del quizz que se desea obtener el promedio
     * @return double que contiene el promedio de las calificaciones de un quizz
     */
    private double obtenerPromedioQuizz(Integer id) {

        double suma = 0;
        double cantidad = 0;

        for (int i = 0; i < presentacionQuizzService.findAll().size(); i++) {

            if (Objects.equals(presentacionQuizzService.findAll().get(i).getId().getQuizz().getId(), id)) {

                suma += presentacionQuizzService.findAll().get(i).getCalificacion();
                cantidad++;
            }
        }

        if(cantidad != 0) return suma / cantidad;

        return 0;
    }


}
