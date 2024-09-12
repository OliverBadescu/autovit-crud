package mycode.autovitcrud.app.exceptions;

import mycode.autovitcrud.app.constants.Constants;

public class CarNotFound extends RuntimeException {
    public CarNotFound(String message) {
        super(message);
        System.out.println(Constants.CAR_NOT_FOUND);
    }
}
