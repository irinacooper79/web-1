package com.example.web1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Web1Application {

    public static model.Ingredient Ingredient;

    public static void main(String[] args) {
        SpringApplication.run(Web1Application.class, args);
    }

}
