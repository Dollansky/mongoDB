package com.example.demo.ModeDto;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ModeDtoService {

    private final ModeDtoRepository ModeDtoRepository;

    public ModeDto saveBlacklist(ModeDto modeDto){
        return ModeDtoRepository.save(modeDto);
    }
}
