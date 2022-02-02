package com.example.demo.participant;

import com.example.demo.ModeDto.ModeDto;
import com.example.demo.blacklist.BlackList;
import com.example.demo.goal.goal;
import com.example.demo.timeIntervall.TimeIntervall;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ParticipantService {

    private final ParticipantRepository participantRepository;

    public Participant saveParticipant(ParticipantDto participantDto) {
        Participant participant = new Participant(participantDto.getName(), participantDto.getEmail());
        return participantRepository.save(participant);
    }

    public void addTimeIntervallToParticipant(TimeIntervall timeIntervall) {
        Participant participant = getParticipantByString(timeIntervall.getParticipantId());
        participant.getTimeIntervalls().add(timeIntervall);
        participantRepository.save(participant);
    }

    public void addModeDtoToParticipant(ModeDto modeDto){
        Participant participant = getParticipantByString(modeDto.getParticipantId());
        participant.getModeDtos().add(modeDto);
        participantRepository.save(participant);
    }

    public void addBlacklistToParticipant(BlackList blacklist){
        Participant participant = getParticipantByString(blacklist.getParticipantId());
        participant.getBlacklists().add(blacklist);
        participantRepository.save(participant);
    }

    public void addGoalToParticipant(goal goal){
        Participant participant = getParticipantByString(goal.getParticipantId());
        participant.getGoals().add(goal);
        participantRepository.save(participant);
    }


    public Participant getParticipantByString(String s) {
        Optional<Participant> participantOptional = participantRepository.findById(s);
        if(participantOptional.isPresent()){
            return participantOptional.get();
        } else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Participant not found");
        }
    }
}
