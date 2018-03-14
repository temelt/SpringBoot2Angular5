package com.temelt.demo;

import com.temelt.demo.entity.User;
import com.temelt.demo.repo.UserRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;
/**
 * Created by tanert on 14.03.2018.
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    ApplicationRunner init(UserRepository repository) {
        return args -> {
            Stream.of("ahmet", "mehmet", "ali", "veli", "admin").forEach(name -> {
                User user = new User();
                user.setName(name);
                repository.save(user);
            });
            repository.findAll().forEach(System.out::println);
        };

    }
}
