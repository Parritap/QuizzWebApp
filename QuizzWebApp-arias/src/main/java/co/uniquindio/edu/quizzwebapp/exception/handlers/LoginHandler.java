package co.uniquindio.edu.quizzwebapp.exception.handlers;

import co.uniquindio.edu.quizzwebapp.exception.exceptions.LoginValidationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;
@RestControllerAdvice
public class LoginHandler {

    @ExceptionHandler(LoginValidationException.class)
    public ResponseEntity<Map<String, String>> loginValidationException(LoginValidationException e){


        if (e.getMessage().equals("El usuario no existe")) {
            return ResponseEntity.status(HttpStatusCode.valueOf(HttpStatus.NOT_FOUND.value()))
                    .body(Map.of("Error", e.getMessage()));
        }

        return ResponseEntity.status(HttpStatusCode.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value())).body(Map.of("Error", e.getMessage()));

    }
}
