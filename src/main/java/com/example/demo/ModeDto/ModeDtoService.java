package com.example.demo.ModeDto;

import com.example.demo.participant.ParticipantService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ModeDtoService {

    private final ModeDtoRepository ModeDtoRepository;
    private final ParticipantService participantService;

    public ModeDto saveBlacklist(ModeDto modeDto){
        ModeDto savedModeDto = ModeDtoRepository.save(modeDto);
        participantService.addModeDtoToParticipant(savedModeDto);
        return savedModeDto;
    }
}
