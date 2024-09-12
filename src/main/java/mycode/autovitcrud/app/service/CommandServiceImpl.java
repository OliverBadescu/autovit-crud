package mycode.autovitcrud.app.service;

import mycode.autovitcrud.app.dto.CreateCarRequest;
import mycode.autovitcrud.app.dto.CreateCarResponse;
import mycode.autovitcrud.app.exceptions.CarNotFound;
import mycode.autovitcrud.app.mapper.MasinaMapper;
import mycode.autovitcrud.app.model.Masina;
import mycode.autovitcrud.app.repository.MasinaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommandServiceImpl implements CommandService{


    private MasinaRepository masinaRepository;

    public CommandServiceImpl(MasinaRepository masinaRepository) {
        this.masinaRepository = masinaRepository;
    }


    public CreateCarResponse addCar(CreateCarRequest createMasinaRequest) {
        Masina masina = Masina.builder().an(createMasinaRequest.an()).km(createMasinaRequest.km()).marca(createMasinaRequest.marca()).model(createMasinaRequest.model()).pret(createMasinaRequest.pret()).uzata(createMasinaRequest.uzata()).build();
        masinaRepository.saveAndFlush(masina);

        return MasinaMapper.INSTANCE.toDto(masina);
    }


    public void deleteCar(int id) {

        Optional<Masina> masina = masinaRepository.findById(id);
        if(masina.isPresent()) {
            masinaRepository.delete(masina.get());
        }else{
            throw new CarNotFound("");
        }
    }



    public void updateCar(int id) {
        Optional<Masina> masina = masinaRepository.findById(id);
        if(masina.isPresent()) {
            masinaRepository.saveAndFlush(masina.get());
        }else{
            throw new CarNotFound("");
        }
    }
}
