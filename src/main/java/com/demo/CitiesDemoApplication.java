package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.demo.repository")
@EntityScan(basePackages = "com.demo.model")
public class CitiesDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CitiesDemoApplication.class, args);
    }
}
