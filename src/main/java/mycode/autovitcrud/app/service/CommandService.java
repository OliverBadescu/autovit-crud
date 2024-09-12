package mycode.autovitcrud.app.service;

import mycode.autovitcrud.app.dto.CreateCarRequest;
import mycode.autovitcrud.app.dto.CreateCarResponse;
import mycode.autovitcrud.app.model.Masina;

public interface CommandService {

    CreateCarResponse addCar(CreateCarRequest createCarRequest);

    void deleteCar(int id);

    void updateCar(int id);
}
