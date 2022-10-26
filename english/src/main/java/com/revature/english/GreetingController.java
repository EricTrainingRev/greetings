package com.revature.english;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class GreetingController {

    private static int count = 0;
    private static double id= Math.random();

    @GetMapping("/english")
    public String genericGreeting(){
        count++;
        return String.format("Hello there from container %s!",id);
    }

    @GetMapping("/english/{name}")
    public String personalGreeting(@PathVariable String name){
        count++;
        return "Hello "  + name + "from container " + id + "!" ;
    }

    @GetMapping("/count")
    public String returnCount() {
        return "this app has recieved " + count + " requests.";
    }
    
}
