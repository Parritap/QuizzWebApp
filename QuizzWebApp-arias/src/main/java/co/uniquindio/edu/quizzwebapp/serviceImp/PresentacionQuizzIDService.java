package co.uniquindio.edu.quizzwebapp.serviceImp;

import co.uniquindio.edu.quizzwebapp.model.entities.PresentacionQuizz;
import co.uniquindio.edu.quizzwebapp.model.entities.PresentacionQuizzID;
import co.uniquindio.edu.quizzwebapp.repositories.PresentacionQuizzIDRepository;
import co.uniquindio.edu.quizzwebapp.repositories.PresentacionQuizzRepository;
import co.uniquindio.edu.quizzwebapp.service.PresentacionQuizzIDI;
import co.uniquindio.edu.quizzwebapp.service.PresentacionQuizzServiceI;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PresentacionQuizzIDService implements PresentacionQuizzIDI {


    private final PresentacionQuizzIDRepository presentacionQuizzIDRepository;


    public List<PresentacionQuizzID> findAll() {
        return presentacionQuizzIDRepository.findAll();
    }

    public List<PresentacionQuizzID> findByQuizz(Integer id) {
        return presentacionQuizzIDRepository.findByQuizz(id);
    }


}
