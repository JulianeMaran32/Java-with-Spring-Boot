package com.juhmaran.springcoredemo.rest;

import com.juhmaran.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    // Specify the bean id: baseaballCoach
    // Same name as class, first character lower-case
    @Autowired
    public DemoController(@Qualifier(value = "baseballCoach") Coach myCoach) {
        this.myCoach = myCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
