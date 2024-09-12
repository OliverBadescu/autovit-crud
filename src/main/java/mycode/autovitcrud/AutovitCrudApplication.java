package mycode.autovitcrud;

import mycode.autovitcrud.app.model.Masina;
import mycode.autovitcrud.app.repository.MasinaRepository;
import mycode.autovitcrud.app.service.CommandService;
import mycode.autovitcrud.app.service.QueryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class AutovitCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutovitCrudApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {




        };
    }

}
