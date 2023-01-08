package com.revature.english;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {

    private static Logger logger = LoggerFactory.getLogger(GreetingController.class);

    private static int count = 0;
    private static double id= Math.random();

    @GetMapping("/english")
    public String genericGreeting(){
        logger.info("generic greeting called");
        count++;
        return String.format("Hello there from container %s!",id);
    }

    @GetMapping("/english/{name}")
    public String personalGreeting(@PathVariable String name){
        logger.warn("someone requested a personal greeting");
        count++;
        return "Hello "  + name + " from container " + id + "!" ;
    }

    @GetMapping("/count")
    public String returnCount() {
        logger.info("someone checked the count of requests to the app");
        count++;
        return "this app has recieved " + count + " requests.";
    }
    
}
