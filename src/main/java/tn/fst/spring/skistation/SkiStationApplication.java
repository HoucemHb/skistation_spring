package tn.fst.spring.skistation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"tn.fst.spring.skistation.entities"})

@ComponentScan(
        basePackages = {"tn.fst.spring.skistation.controllers", "tn.fst.spring.skistation.services"}
)
@EnableJpaRepositories(
        basePackages = {"tn.fst.spring.skistation.repositories"}
)
public class SkiStationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkiStationApplication.class, args);
    }

}
