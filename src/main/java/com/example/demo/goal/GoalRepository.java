package com.example.demo.goal;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface GoalRepository extends MongoRepository<goal, String> {
}
