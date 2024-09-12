package mycode.autovitcrud.app.service;

import mycode.autovitcrud.app.exceptions.CarNotFound;
import mycode.autovitcrud.app.model.Masina;
import mycode.autovitcrud.app.repository.MasinaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QueryServiceimpl implements QueryService{

    private MasinaRepository masinaRepository;

    public QueryServiceimpl(MasinaRepository masinaRepository) {
        this.masinaRepository = masinaRepository;
    }


    public void showCars() {
        List<Masina> list = masinaRepository.findAll();

        list.forEach(System.out::println);
    }

    @Override
    public Masina findByMakeAndModel(String marca, String model) {
        Optional<Masina> masina = masinaRepository.findByMarcaAndModel(marca,model);

        if(masina.isPresent()){
            return masina.get();
        }else{
            throw new CarNotFound("");
        }

    }

    @Override
    public List<Masina> findAllCars() {
        return masinaRepository.findAll();
    }


}
