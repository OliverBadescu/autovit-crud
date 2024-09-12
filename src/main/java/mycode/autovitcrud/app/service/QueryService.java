package mycode.autovitcrud.app.service;

import mycode.autovitcrud.app.model.Masina;

import java.util.List;

public interface QueryService {

    void showCars();

    Masina findByMakeAndModel(String marca, String model);

    List<Masina> findAllCars();
}
