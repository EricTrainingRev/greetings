package com.revature.spanish;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {
    @GetMapping("/spanish")
    public String genericGreeting(){
        return "Hola!";
    }
    @GetMapping("/spanish/{name}")
    public String personalGreeting(@PathVariable String name){
        return "Hola " + name + "!";
    }
}
