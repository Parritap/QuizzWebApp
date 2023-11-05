package co.uniquindio.edu.quizzwebapp.serviceImp;

import co.uniquindio.edu.quizzwebapp.model.entities.Docente;
import co.uniquindio.edu.quizzwebapp.repositories.DocenteRepository;
import co.uniquindio.edu.quizzwebapp.service.DocenteServiceI;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DocenteService implements DocenteServiceI {

    private final DocenteRepository docenteRepository;


    @Override
    public List<Docente> findAll() {
        return docenteRepository.findAll();
    }

    @Override
    public void save(Docente docente) {
        docenteRepository.save(docente);
    }


}
