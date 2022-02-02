package com.example.demo.ModeDto;

import com.example.demo.participant.ParticipantService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/modeDto")
@AllArgsConstructor
public class ModeDtoController {
    private final ModeDtoService modeDtoService;
    private final ParticipantService participantService;

    @PostMapping("/create")
    public ResponseEntity<ModeDto> saveModeDto(@RequestBody ModeDto modeDto) {

        return new ResponseEntity<ModeDto>(modeDtoService.saveBlacklist(modeDto), HttpStatus.OK);
    }
}
