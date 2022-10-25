package com.revature.english;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/english")
    public String genericGreeting(){
        return "Hello there!";
    }

    @GetMapping("/english/{name}")
    public String personalGreeting(@PathVariable String name){
        return "Hello "  + name + "!";
    }
}
