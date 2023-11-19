package co.uniquindio.edu.quizzwebapp.serviceImp;

import co.uniquindio.edu.quizzwebapp.dto.PromedioQuizzDTO;
import co.uniquindio.edu.quizzwebapp.model.entities.PresentacionQuizz;
import co.uniquindio.edu.quizzwebapp.repositories.PresentacionQuizzRepository;
import co.uniquindio.edu.quizzwebapp.service.PresentacionQuizzServiceI;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PresentacionQuizzService implements PresentacionQuizzServiceI {


    private final PresentacionQuizzRepository presentacionQuizzRepository;


    public List<PresentacionQuizz> findAll() {
        return presentacionQuizzRepository.findAll();
    }

    public List<PresentacionQuizz> findByQuizz(Integer quizz_id) {
        return presentacionQuizzRepository.findByQuizz(quizz_id);
    }

    public List<PresentacionQuizz> findByEstudiante(Integer estudianteId) {
        return presentacionQuizzRepository.findByEstud(estudianteId);
    }

    public List<PresentacionQuizz> findByDocente(Integer idDocente) {
        return presentacionQuizzRepository.findByQuizzDocenteId(idDocente);
    }
}
