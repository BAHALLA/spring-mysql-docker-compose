package org.sid;

import org.sid.dao.ProductRepository;
import org.sid.entities.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class SpringDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDockerApplication.class, args);
    }

    @Bean
    public CommandLineRunner start(ProductRepository productRepository) {
        return args -> {
            Stream.of("P1","P2","P3")
                    .forEach(p -> {
                         productRepository.save(new Product(null, p, Math.random()*10+100));
                    });
        };
    }

}
