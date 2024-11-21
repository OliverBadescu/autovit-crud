package mycode.autovitcrud.app.global_exceptions;

import mycode.autovitcrud.app.exceptions.CarAlreadyExists;
import mycode.autovitcrud.app.exceptions.CarNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionsHandler {

    @ExceptionHandler({CarNotFound.class})
    public ResponseEntity<Object> handleCarNotFoundException(CarNotFound exception) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(exception.getMessage());
    }

    @ExceptionHandler({CarAlreadyExists.class})
    public ResponseEntity<Object> handleCarAlreadyExistsException(CarAlreadyExists exception) {
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(exception.getMessage());
    }
}
