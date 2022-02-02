package com.example.demo.timeIntervall;

import com.example.demo.goal.GoalRepository;
import com.example.demo.goal.goal;
import com.example.demo.participant.ParticipantService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class TimeIntervallService {

    private final timeRepository timeRepository;
    private final GoalRepository goalRepository;
    private final ParticipantService participantService;


    public List<TimeIntervall> getAlltimeIntervall(){
        return timeRepository.findAll();

    }

    public TimeIntervall saveIntervall(TimeIntervall timeIntervall) {
        TimeIntervall savedIntervall = timeRepository.save(timeIntervall);
        participantService.addTimeIntervallToParticipant(timeIntervall);
        addToGoal(savedIntervall);
        return savedIntervall;
    }

    private void addToGoal(TimeIntervall savedIntervall) {
        Optional<goal> goal = goalRepository.findById(savedIntervall.getGoalId());
        if(goal.isPresent()){
            goal getGoal = goal.get();
            getGoal.getTimeIntervalls().add(savedIntervall);
            goalRepository.save(getGoal);
        }
    }

}
