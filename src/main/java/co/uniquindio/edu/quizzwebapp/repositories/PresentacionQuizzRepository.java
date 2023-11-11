package co.uniquindio.edu.quizzwebapp.repositories;


import co.uniquindio.edu.quizzwebapp.model.entities.PresentacionQuizz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PresentacionQuizzRepository extends JpaRepository<PresentacionQuizz, Long> {
}
