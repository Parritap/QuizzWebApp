package co.uniquindio.edu.quizzwebapp.model.entities;

public enum Categoria {

    CALCULO("CALCULO123"), FISICA ("FISICA"), QUIMICA ("QUIMICA"), BIOLOGIA ("BIOLOGIA"),
    PROGRAMACION ("PROGRAMACION"), INGLES ("INGLES"), ESPAÑOL ("ESPAÑOL"), HISTORIA ("HISTORIA"),
    GEOGRAFIA ("GEOGRAFIA"), LITERATURA ("LITERATURA"), ARTE ("ARTE"), MUSICA ("MUSICA");

    public final String label;
    Categoria(String label) {
        this.label= label;
    }


}
