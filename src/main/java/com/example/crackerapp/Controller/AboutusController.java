package com.example.crackerapp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutusController {

    @GetMapping("/Aboutus")
    public String aboutus(){
        return "aboutus";
    }

    
}
