package com.timoxino.java.spring.ai.dogsproject.dog;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public record Dog(@Id int id, String name, String owner, String description) {
}
