package com.example.demo.participant;

import com.example.demo.blacklist.BlackList;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/participant")
@AllArgsConstructor
public class ParticipantController {
    private final ParticipantService participantService;


    @PostMapping("/create")
    public ResponseEntity<String> saveParticipant(@RequestBody Participant participant) {
        return new ResponseEntity<String>(participantService.saveParticipant(participant).getId(), HttpStatus.OK);
    }
}
