package co.uniquindio.edu.quizzwebapp.dto;

import java.time.LocalDateTime;

public record EstadoQuizzDTO(
    LocalDateTime fechaFin,
    String Titulo,
    Integer estudiantesPresentados
) {
}
