package co.uniquindio.edu.quizzwebapp.controllers;

import co.uniquindio.edu.quizzwebapp.dto.NotaDTO;
import co.uniquindio.edu.quizzwebapp.dto.NotaEstudianteDTO;
import co.uniquindio.edu.quizzwebapp.dto.PonderadoDTO;
import co.uniquindio.edu.quizzwebapp.dto.TemaDTO;
import co.uniquindio.edu.quizzwebapp.model.entities.Estudiante;
import co.uniquindio.edu.quizzwebapp.model.entities.PresentacionQuizz;
import co.uniquindio.edu.quizzwebapp.model.entities.Quizz;
import co.uniquindio.edu.quizzwebapp.serviceImp.AdministradorService;
import co.uniquindio.edu.quizzwebapp.serviceImp.DocenteService;
import co.uniquindio.edu.quizzwebapp.serviceImp.EstudianteService;
import co.uniquindio.edu.quizzwebapp.serviceImp.PresentacionQuizzService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/estudiante")
@CrossOrigin
@AllArgsConstructor
public class EstudianteController {

    private final DocenteService docenteService;
    private final EstudianteService estudianteService;
    private final AdministradorService administradorService;
    private final PresentacionQuizzService presentacionQuizzService;


    //Metodo Alejandro

    /**
     * Este metodo permite devolver los temas de los grupos de un estudiante
     * dado su id
     */

    @GetMapping("/temas/{idEstudiante}")
    public List<TemaDTO> temas(@PathVariable Integer idEstudiante) {

        ArrayList<TemaDTO> temaDTOS = new ArrayList<>();

        estudianteService.findById(idEstudiante).getGrupos().forEach(grupo ->
           grupo.getCurso().getTemas().forEach(tema -> {

            TemaDTO temaDTO = new TemaDTO(
                    tema.getNombre(),
                    tema.getDescripcion()
            );

            temaDTOS.add(temaDTO);

        }));

        return temaDTOS;
    }

    //Metodo de Alejandro

    /**
     * Metodo que permite mostrar al estudiante el ponderado actual de todas sus materias
     * @param idEstudiante id del estudiante que se desea obtener el ponderado
     * @return List<PonderadoDTO> que contiene el ponderado de todas las materias del estudiante
     */

    @GetMapping("/ponderado/{idEstudiante}")
    public List<PonderadoDTO> ponderado(@PathVariable Integer idEstudiante) {

        ArrayList<PonderadoDTO> ponderadoDTOS = new ArrayList<>();

        Estudiante estudiante = estudianteService.findById(idEstudiante);

        presentacionQuizzService.findAll().forEach(presentacionQuizz  -> {

            if (presentacionQuizz.getEstudiante().equals(estudiante)) { //Si el estudiante de la presentacion es el mismo que el que se busca

                Quizz quizz = presentacionQuizz.getQuizz(); //Se obtiene el quizz de la presentacion

                double porcentaje = quizz.getPorcentajeCurso().doubleValue() * presentacionQuizz.getCalificacion(); //Se calcula el ponderado

                PonderadoDTO ponderadoDTO = new PonderadoDTO(

                        quizz.getCategoria(),
                        porcentaje

                );

                ponderadoDTOS.add(ponderadoDTO);

            }

        });


        return ponderadoDTOS;
    }

    @GetMapping("/notas/{idEstudiante}")
    public ArrayList<NotaEstudianteDTO> notasQuizz(@PathVariable Integer idEstudiante) {

        ArrayList<NotaEstudianteDTO> notasQuizzDTOS = new ArrayList<>();

        presentacionQuizzService.findByEstudiante(idEstudiante).forEach(presentacionQuizz -> {
            
                NotaEstudianteDTO notaDTO = new NotaEstudianteDTO(
                    presentacionQuizz.getId(),
                    presentacionQuizz.getCalificacion());

            notasQuizzDTOS.add(notaDTO);
            });
        
        return notasQuizzDTOS;
    }


}
