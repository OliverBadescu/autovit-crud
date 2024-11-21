package mycode.autovitcrud.app.web;


import lombok.AllArgsConstructor;
import mycode.autovitcrud.app.dto.CreateCarRequest;
import mycode.autovitcrud.app.dto.CarResponse;
import mycode.autovitcrud.app.dto.UpdateCarRequest;
import mycode.autovitcrud.app.model.Car;
import mycode.autovitcrud.app.service.CommandService;
import mycode.autovitcrud.app.service.QueryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/car")
@CrossOrigin
public class AutovitController {


    private QueryService queryService;
    private CommandService commandService;


    @GetMapping(path = "/getAll")
    public ResponseEntity<List<CarResponse>> getAllCars(){
        return new ResponseEntity<>(queryService.findAllCars(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<CarResponse> addCar(@RequestBody CreateCarRequest createCarRequest) {
        return new ResponseEntity<>(commandService.addCar(createCarRequest), HttpStatus.CREATED);
    }

    @GetMapping(path = {"/getById/{carId}"})
    public ResponseEntity<CarResponse> getCar(@PathVariable int carId){
        return new ResponseEntity<>(queryService.findById(carId), HttpStatus.OK);
    }

    @DeleteMapping(path = {"/delete/{carId}"})
    public ResponseEntity<CarResponse> deleteCar(@PathVariable int carId){
        return new ResponseEntity<>(commandService.deleteCar(carId), HttpStatus.ACCEPTED);
    }

    @PutMapping(path = {"/update/{carId}"})
    public ResponseEntity<CarResponse> updateCar(@PathVariable int carId, @RequestBody UpdateCarRequest updateCarRequest){
        return new ResponseEntity<>(commandService.updateCar(carId, updateCarRequest), HttpStatus.ACCEPTED);
    }

}
