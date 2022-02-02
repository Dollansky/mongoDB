package com.example.demo.timeIntervall;

import org.springframework.data.mongodb.repository.MongoRepository;



public interface timeRepository
        extends MongoRepository<TimeIntervall, String> {

}
