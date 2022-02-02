package com.example.demo.goal;

import com.example.demo.timeIntervall.TimeIntervall;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@Builder
@Document
@AllArgsConstructor
@NoArgsConstructor
public class goal {
    @Id
    private String id;
    private String participantId;
    private String goal;
    private String reason;
    private String domain;
    private List<Number> setGoalTimes;
    private List<TimeIntervall> timeIntervalls;

}
