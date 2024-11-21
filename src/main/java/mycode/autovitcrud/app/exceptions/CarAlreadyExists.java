package mycode.autovitcrud.app.exceptions;

public class CarAlreadyExists extends RuntimeException {
    public CarAlreadyExists(String message) {
        super(message);
    }
}
