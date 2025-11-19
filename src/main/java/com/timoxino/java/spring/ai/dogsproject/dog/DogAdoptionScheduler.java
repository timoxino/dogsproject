package com.timoxino.java.spring.ai.dogsproject.dog;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class DogAdoptionScheduler {

    @Tool(description = "schedule an appointment to pickup or " +
            "adopt a dog from a Pooch Palace location")
    String scheduleAdoption(@ToolParam(description = "the id of the dog") int dogId, @ToolParam(description = "the name of the dog") String dogName) {
        System.out.println("Scheduling adoption for dog with id: %d and name: %s".formatted(dogId, dogName));
        return Instant.now().plus(3, java.time.temporal.ChronoUnit.DAYS).toString();
    }
}
