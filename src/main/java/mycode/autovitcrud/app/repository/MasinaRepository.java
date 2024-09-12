package mycode.autovitcrud.app.repository;

import mycode.autovitcrud.app.model.Masina;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MasinaRepository extends JpaRepository<Masina,Integer> {

    Optional<Masina> findByMarcaAndModel(String marca, String model);

    Optional<Masina> findById(int id);

}
