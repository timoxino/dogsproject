package com.timoxino.java.spring.ai.dogsproject.dog;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Dog {
    @Id
    private int id;
    private String name;
    private String owner;
    private String description;

    public Dog() {
    }

    public Dog(int id, String name, String owner, String description) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.description = description;
    }

    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String owner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String description() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
