package co.uniquindio.edu.quizzwebapp.repositories;


import co.uniquindio.edu.quizzwebapp.model.entities.PresentacionQuizz;
import co.uniquindio.edu.quizzwebapp.model.entities.PresentacionQuizzID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PresentacionQuizzRepository extends JpaRepository<PresentacionQuizz, Long> {

    @Query("SELECT p FROM PresentacionQuizz p WHERE p.id = :quizzId")
    List<PresentacionQuizz> findByQuizz(@Param("quizzId") Integer id);

}