package co.uniquindio.edu.quizzwebapp.repositories;

import co.uniquindio.edu.quizzwebapp.model.entities.Quizz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizzRepository extends JpaRepository<Quizz, Integer> {


        Quizz findByDocenteId(Integer docenteId);

}