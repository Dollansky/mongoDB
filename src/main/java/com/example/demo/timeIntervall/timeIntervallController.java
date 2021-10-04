package com.example.demo.timeIntervall;

import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/timeIntervall")
@AllArgsConstructor
public class timeIntervallController {

    private final TimeIntervallService timeIntervallService;



    @GetMapping
    public List<TimeIntervall> getAllIntervalls() {
        return timeIntervallService.getAlltimeIntervall();

    }

    @PostMapping("/create")
    public ResponseEntity<TimeIntervall> saveIntervall(@RequestBody TimeIntervall s) {

        return new ResponseEntity<TimeIntervall>(timeIntervallService.saveIntervall(s), HttpStatus.OK);

//        timeIntervallService.saveIntervall(timeIntervall);
    }

    @GetMapping("/{id}")
    public List<TimeIntervall> getAllIntervallsById(@PathVariable("id") Long participantId){
        return timeIntervallService.getAlltimeIntervallById(participantId);
    }
}
