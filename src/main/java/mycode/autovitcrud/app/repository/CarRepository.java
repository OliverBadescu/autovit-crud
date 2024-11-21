package mycode.autovitcrud.app.repository;

import mycode.autovitcrud.app.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CarRepository extends JpaRepository<Car,Integer> {

    Optional<Car> findByMarcaAndModel(String marca, String model);

    Optional<Car> findById(int id);

}
