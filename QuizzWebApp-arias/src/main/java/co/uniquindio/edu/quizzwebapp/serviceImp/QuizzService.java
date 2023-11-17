package co.uniquindio.edu.quizzwebapp.serviceImp;

import co.uniquindio.edu.quizzwebapp.model.entities.Quizz;
import co.uniquindio.edu.quizzwebapp.repositories.QuizzRepository;
import co.uniquindio.edu.quizzwebapp.service.QuizzServiceI;
import co.uniquindio.edu.quizzwebapp.service.QuizzServiceI;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class QuizzService implements QuizzServiceI {

    private final QuizzRepository quizzRepository;


    public List<Quizz> findAll() {
        return quizzRepository.findAll();
    }

    public void save(Quizz quizz) {
        quizzRepository.save(quizz);
    }

    public Quizz findByDocente(Integer docente_id) {
        return quizzRepository.findByDocenteId(docente_id);
    }

}
