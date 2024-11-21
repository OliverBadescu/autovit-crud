package mycode.autovitcrud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

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
