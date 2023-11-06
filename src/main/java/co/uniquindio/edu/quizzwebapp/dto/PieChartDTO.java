package co.uniquindio.edu.quizzwebapp.dto;

import java.util.HashMap;

public record PieChartDTO(
        String tituloChart,
        HashMap<String, Integer> cursoAlumnos
) {
}
