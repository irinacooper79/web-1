package com.example.web1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FirstController {
    @GetMapping

    public String appIsRunning() {
        return "Приложение запущено";
    }

    @GetMapping("/info")

    public String appInfo() {
        return "Author name: " + "Имя фамилия" + "<br>" +
                "Project name: RecipeBook" + "<br>" +
                "Creation date: 20/01/2023" + "<br>" +
                "Project description: My first spring project";
    }
}