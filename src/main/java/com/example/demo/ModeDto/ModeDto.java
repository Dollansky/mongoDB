package com.example.demo.ModeDto;

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
public class ModeDto {
    @Id
    private String id;
    private String participantId;
    private boolean mode;
    private Date dateWhenModeEnds;
    private Double duration;
}
