package co.uniquindio.edu.quizzwebapp.repositories;

import co.uniquindio.edu.quizzwebapp.model.entities.Estudiante;
import co.uniquindio.edu.quizzwebapp.model.entities.PresentacionQuizzID;
import co.uniquindio.edu.quizzwebapp.model.entities.Quizz;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PresentacionQuizzIDRepository extends JpaRepository<PresentacionQuizzID, Long> {
    
    List<PresentacionQuizzID> findByQuizz(Integer id);
}
