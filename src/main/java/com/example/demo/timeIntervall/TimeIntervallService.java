package com.example.demo.timeIntervall;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class TimeIntervallService {

    private final timeRepository timeRepository;


    public List<TimeIntervall> getAlltimeIntervall(){
        return timeRepository.findAll();

    }

    public TimeIntervall saveIntervall(TimeIntervall timeIntervall){
        return timeRepository.save(timeIntervall);
    }

}
