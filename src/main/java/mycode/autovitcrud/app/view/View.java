package mycode.autovitcrud.app.view;

import mycode.autovitcrud.app.dto.CreateCarRequest;
import mycode.autovitcrud.app.model.Masina;
import mycode.autovitcrud.app.repository.MasinaRepository;
import mycode.autovitcrud.app.service.CommandService;
import mycode.autovitcrud.app.service.QueryService;
import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

import java.util.List;


//@Component
public class View {


    private CommandService commandService;
    private QueryService queryService;


    public View(CommandService commandService, QueryService queryService){
        this.commandService = commandService;
        this.queryService = queryService;

    }

//    private void showAllCars(){
//
//        queryService.showCars();
//
//    }
//
//    private void addCar(){
//
//        CreateCarRequest createCarRequest = new CreateCarRequest("test", " ", 11, true, 25.25, 2014);
//
//        commandService.addCar(createCarRequest);
//
//    }
//
//    private void deleteCar(){
//
//        Masina masina = queryService.findByMakeAndModel("test", " ");
//
//        commandService.deleteCar(masina);
//
//    }
//
//
//    private void updateCar(){
//
//        Masina masina = queryService.findByMakeAndModel("test", " ");
//
//        commandService.updateCar(masina);
//
//    }


}
