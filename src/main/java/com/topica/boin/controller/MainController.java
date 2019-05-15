package com.topica.boin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String wellCome(){
        return "WellCome to Spring Boot";
    }
}
