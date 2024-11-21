package mycode.autovitcrud.app.exceptions;


public class CarNotFound extends RuntimeException {
    public CarNotFound(String message) {
        super(message);
    }
}
