package mycode.autovitcrud.app.service;

import mycode.autovitcrud.app.dto.CreateCarRequest;
import mycode.autovitcrud.app.dto.CarResponse;
import mycode.autovitcrud.app.dto.UpdateCarRequest;
import org.hibernate.sql.Update;

public interface CommandService {

    CarResponse addCar(CreateCarRequest createCarRequest);

    CarResponse deleteCar(int id);

    CarResponse updateCar(int id, UpdateCarRequest updateCarRequest);
}
