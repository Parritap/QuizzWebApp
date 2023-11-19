package co.uniquindio.edu.quizzwebapp.repositories;


import co.uniquindio.edu.quizzwebapp.dto.PromedioQuizzDTO;
import co.uniquindio.edu.quizzwebapp.model.entities.PresentacionQuizz;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PresentacionQuizzRepository extends JpaRepository<PresentacionQuizz, Integer> {

    @Query("SELECT p FROM PresentacionQuizz p WHERE p.quizz.id = :quizzId")
    List<PresentacionQuizz> findByQuizz(@Param("quizzId") Integer id);

    @Query("SELECT p FROM PresentacionQuizz p WHERE p.estudiante.id = :estudianteId")
    List<PresentacionQuizz> findByEstud(@Param("estudianteId") Integer id);
    
    @Query("SELECT p FROM PresentacionQuizz p JOIN Quizz q ON q.id = p.quizz.id WHERE  q.docente.id = :docenteId ")
    List<PresentacionQuizz> findByQuizzDocenteId(@Param("docenteId") Integer docenteId);

}