package com.example.demo.timeIntervall;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface timeRepository
        extends MongoRepository<TimeIntervall, String> {

}
