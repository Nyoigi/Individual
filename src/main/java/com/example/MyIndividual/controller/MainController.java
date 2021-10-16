package com.example.MyIndividual.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    @GetMapping("/hotel")
    public String Main(Model model){
        return "hotel";
    }

    @PostMapping("/hotel")
    public String Hotel(Model model){
        return "hotel";
    }
}
