package co.uniquindio.edu.quizzwebapp.serviceImp;

import co.uniquindio.edu.quizzwebapp.model.entities.Estudiante;
import co.uniquindio.edu.quizzwebapp.repositories.EstudianteRepository;
import co.uniquindio.edu.quizzwebapp.service.EstudianteServiceI;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class EstudianteService implements EstudianteServiceI {

    private final EstudianteRepository estudianteRepository;

    public List<String> findAllNames() {
        List<String> nombres = new ArrayList<>();
        estudianteRepository.findAll().forEach(estudiante -> nombres.add(estudiante.getNombre()));
        return nombres;
    }

    public Estudiante findByCorreoAndPassword(String correo, String password) {
        return estudianteRepository.findByCorreoAndPassword(correo, password);
    }

    public Estudiante findById(Long id) {
        return estudianteRepository.findById(id).orElse(null);
    }

}
