package com.example.demo.participant;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ParticipantService {

    private final ParticipantRepository participantRepository;

    public Participant saveParticipant(Participant participant){
        return participantRepository.save(participant);
    }
}
