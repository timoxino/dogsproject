package com.timoxino.java.spring.ai.dogsproject.dog;

import org.springframework.data.repository.ListCrudRepository;

public interface DogRepository extends ListCrudRepository<Dog, Integer> {
}
