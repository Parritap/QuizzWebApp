package co.uniquindio.edu.quizzwebapp.service;

import co.uniquindio.edu.quizzwebapp.model.entities.Docente;

import java.util.List;

public interface DocenteServiceI {


    List<Docente> findAll();
    void save(Docente docente);

}
