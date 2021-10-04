package com.example.demo.timeIntervall;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@Document
@AllArgsConstructor
@NoArgsConstructor
public class TimeIntervall {
    @Id
    private String id;
    private Long participantId;
    private Number timeSpend;
    private String goal;
    private Boolean blacklisted;


    public TimeIntervall(Long participantId,Number timeSpend, String goal, Boolean blacklisted) {
        this.participantId = participantId;
        this.timeSpend = timeSpend;
        this.goal = goal;
        this.blacklisted = blacklisted;
    }
}
