package co.uniquindio.edu.quizzwebapp.model.entities.preguntas;

public enum Categoria {

    CALCULO("CALCULO"), FISICA ("FISICA"), QUIMICA ("QUIMICA"), BIOLOGIA ("BIOLOGIA"),
    PROGRAMACION ("PROGRAMACION"), INGLES ("INGLES"), ESPAÑOL ("ESPAÑOL"), HISTORIA ("HISTORIA"),
    GEOGRAFIA ("GEOGRAFIA"), LITERATURA ("LITERATURA"), ARTE ("ARTE"), MUSICA ("MUSICA");

    private final String contenido;
    Categoria(String contenido) {
        this.contenido = contenido;
    }


}
