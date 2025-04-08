package com.juhmaran.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        System.out.println("In constructor: " + getClass().getSimpleName());
        return "Practice your backhand volley";
    }

}
