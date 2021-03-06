package com.example.demo.timeIntervall;

import com.example.demo.participant.ParticipantService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("api/timeIntervall")
@AllArgsConstructor
public class TimeIntervallController {

    private final TimeIntervallService timeIntervallService;
    private final ParticipantService participantService;



    @GetMapping
    public List<TimeIntervall> getAllIntervalls() {
        return timeIntervallService.getAlltimeIntervall();

    }

    @PostMapping("/create")
    public ResponseEntity<TimeIntervall> saveIntervall(@RequestBody TimeIntervall s) {
        participantService.addTimeIntervallToParticipant(s);
        return new ResponseEntity<TimeIntervall>(timeIntervallService.saveIntervall(s), HttpStatus.OK);

    }


}
