package com.petadoption.PetAdoptions;


import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/")
    public String Pet(){
        return "Pet";
    }
}
