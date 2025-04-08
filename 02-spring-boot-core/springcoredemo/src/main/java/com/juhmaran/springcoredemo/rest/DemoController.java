package com.juhmaran.springcoredemo.rest;

import com.juhmaran.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // Define a private field for the dependency
    private Coach myCoach;

    @Autowired
    public DemoController(@Qualifier(value = "cricketCoach") Coach myCoach) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        this.myCoach = myCoach;
    }

    @GetMapping(value = "/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
