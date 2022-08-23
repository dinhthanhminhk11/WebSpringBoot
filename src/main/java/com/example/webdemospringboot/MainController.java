package com.example.webdemospringboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("")
    public String showHOmePage() {
        System.out.println("Main controller");
        return "index";
    }
}
