package mycode.autovitcrud.app.mapper;

import mycode.autovitcrud.app.dto.CarResponse;
import mycode.autovitcrud.app.model.Car;


public class CarMapper {
    
    public static CarResponse carToResponseDto(Car car){
        return new CarResponse(
                car.getId(),
                car.getMarca(),
                car.getModel(),
                car.getKm(),
                car.isUzata(),
                car.getPret(),
                car.getAn()
        );
    }
    

}
