package mycode.autovitcrud.app.web;


import lombok.AllArgsConstructor;
import mycode.autovitcrud.app.dto.CreateCarRequest;
import mycode.autovitcrud.app.dto.CreateCarResponse;
import mycode.autovitcrud.app.model.Masina;
import mycode.autovitcrud.app.service.CommandService;
import mycode.autovitcrud.app.service.QueryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class AutovitController {


    private QueryService queryService;
    private CommandService commandService;



    @GetMapping("/test/oliver")
    public ResponseEntity<List<Masina>> getCourseByCode() {
        return ResponseEntity.ok(queryService.findAllCars());
    }

    @PostMapping("/add")
    public ResponseEntity<CreateCarResponse> getCourseByCode(@RequestBody CreateCarRequest createCarRequest) {
        return ResponseEntity.ok(commandService.addCar(createCarRequest));
    }


}
