package com.example.hello_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.example.hello_app")
public class HelloAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloAppApplication.class, args);
    }

}
