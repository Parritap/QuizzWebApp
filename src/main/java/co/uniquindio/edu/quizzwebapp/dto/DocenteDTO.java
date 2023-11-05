package co.uniquindio.edu.quizzwebapp.dto;

public record DocenteDTO(
        String nombre,
        String apellido,
        String correo,
        String password,
        boolean esEstudiante
) {
}
