package co.uniquindio.edu.quizzwebapp.serviceImp;

import co.uniquindio.edu.quizzwebapp.model.entities.Docente;
import co.uniquindio.edu.quizzwebapp.repositories.DocenteRepository;
import co.uniquindio.edu.quizzwebapp.service.DocenteServiceI;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class DocenteService implements DocenteServiceI {

    private final DocenteRepository docenteRepository;


    public List<Docente> findAll() {
        return docenteRepository.findAll();
    }

    public void save(Docente docente) {
        docenteRepository.save(docente);
    }

    public Docente findByCorreoAndPassword(String correo, String password) {
        return docenteRepository.findByCorreoAndPassword(correo, password);
    }


    public List<String> findAllNames() {
        ArrayList<String> nombres = new ArrayList<>();
        docenteRepository.findAll().forEach(docente -> nombres.add(docente.getNombre()));
        return nombres;
    }
}
