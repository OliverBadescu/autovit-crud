package mycode.autovitcrud.app.service;

import lombok.AllArgsConstructor;
import mycode.autovitcrud.app.dto.CarResponse;
import mycode.autovitcrud.app.exceptions.CarNotFound;
import mycode.autovitcrud.app.mapper.CarMapper;
import mycode.autovitcrud.app.model.Car;
import mycode.autovitcrud.app.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class QueryServiceimpl implements QueryService{

    private CarRepository carRepository;



    @Override
    public List<CarResponse> findAllCars() {
        List<Car> list = carRepository.findAll();

        List<CarResponse> rez = new ArrayList<>();

        list.forEach(car -> {
            rez.add(CarMapper.carToResponseDto(car));
        });

        return rez;
    }

    @Override
    public CarResponse findById(int id) {
        Car car = carRepository.findById(id)
                .orElseThrow(() -> new CarNotFound("No car with this id found"));

        return CarMapper.carToResponseDto(car);
    }


}
