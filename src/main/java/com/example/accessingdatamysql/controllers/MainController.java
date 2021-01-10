package com.example.accessingdatamysql.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {
    @GetMapping("/")
    String greeting(){
        return "This is an api for an android project";
    }

}
