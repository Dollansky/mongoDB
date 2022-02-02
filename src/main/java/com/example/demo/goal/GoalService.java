package com.example.demo.goal;

import com.example.demo.participant.ParticipantService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class GoalService {

    private final GoalRepository GoalRepository;
    private final ParticipantService participantService;

    public goal saveGoal(goal goal){
        goal savedGoal = GoalRepository.save(goal);
        participantService.addGoalToParticipant(savedGoal);
        return savedGoal;
    }
}
