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
    private String participantId;
    private Number timeSpend;
    private String domain;
    private boolean blacklisted;
    private boolean mode;
    private boolean baselineFinished;
    private String goalId;
    private String goal;
    private String reason;
}
