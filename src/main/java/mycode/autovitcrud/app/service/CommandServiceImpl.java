package mycode.autovitcrud.app.service;

import lombok.AllArgsConstructor;
import mycode.autovitcrud.app.dto.CreateCarRequest;
import mycode.autovitcrud.app.dto.CarResponse;
import mycode.autovitcrud.app.dto.UpdateCarRequest;
import mycode.autovitcrud.app.exceptions.CarAlreadyExists;
import mycode.autovitcrud.app.exceptions.CarNotFound;
import mycode.autovitcrud.app.mapper.CarMapper;
import mycode.autovitcrud.app.model.Car;
import mycode.autovitcrud.app.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class CommandServiceImpl implements CommandService{


    private CarRepository carRepository;

    public CarResponse addCar(CreateCarRequest createMasinaRequest) {
        Car car = Car.builder().an(createMasinaRequest.an()).km(createMasinaRequest.km()).marca(createMasinaRequest.marca()).model(createMasinaRequest.model()).pret(createMasinaRequest.pret()).uzata(createMasinaRequest.uzata()).build();

        List<Car> list= carRepository.findAll();

        list.forEach(car1 -> {
            if (car1.getMarca().equals(car.getMarca()) && car1.getModel().equals(car.getModel())){
                throw new CarAlreadyExists("Car with this make and model already exists, please enter a different make and model");
            }
        });

        carRepository.saveAndFlush(car);

        return CarMapper.carToResponseDto(car);
    }

    @Override
    public CarResponse deleteCar(int id) {
        Car car = carRepository.findById(id)
                .orElseThrow(() -> new CarNotFound("No car with this id found"));

        CarResponse carResponse = CarMapper.carToResponseDto(car);

        carRepository.delete(car);
        return carResponse;


    }

    @Override
    public CarResponse updateCar(int id, UpdateCarRequest up) {
        Car car = carRepository.findById(id)
                .orElseThrow(() -> new CarNotFound("No car with this id found"));

        car.setAn(up.an());
        car.setKm(up.km());
        car.setMarca(up.marca());
        car.setModel(up.model());
        car.setPret(up.pret());
        car.setUzata(up.uzata());

        return CarMapper.carToResponseDto(car);
    }


}
