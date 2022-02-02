package com.example.demo.blacklist;

import com.example.demo.participant.ParticipantRepository;
import com.example.demo.participant.ParticipantService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BlackListService {

    private final BlackListRepository blackListRepository;
    private final ParticipantService participantService;

    public BlackList saveBlacklist(BlackList blackList) {
        BlackList savedBlacklist = blackListRepository.save(blackList);
        participantService.addBlacklistToParticipant(savedBlacklist);
        return savedBlacklist;
    }
}
