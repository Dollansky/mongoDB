package com.example.demo.participant;

import com.example.demo.ModeDto.ModeDto;
import com.example.demo.blacklist.BlackList;
import com.example.demo.goal.goal;
import com.example.demo.timeIntervall.TimeIntervall;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Participant {
    @Id
    private String id;
    private String name;
    private String email;

    private List<goal> goals;
    private List<BlackList> blacklists;
    private List<ModeDto> modeDtos;
    private List<TimeIntervall> timeIntervalls;

    public Participant(String name, String email) {
        this.name = name;
        this.email = email;
        this.blacklists = new ArrayList<>();
        this.goals = new ArrayList<>();
        this.modeDtos = new ArrayList<>();
        this.timeIntervalls = new ArrayList<>();
    }

}
