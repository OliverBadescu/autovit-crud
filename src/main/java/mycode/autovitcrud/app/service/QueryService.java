package mycode.autovitcrud.app.service;

import mycode.autovitcrud.app.dto.CarResponse;
import mycode.autovitcrud.app.model.Car;

import java.util.List;

public interface QueryService {


    List<CarResponse> findAllCars();

    CarResponse findById(int id);
}
