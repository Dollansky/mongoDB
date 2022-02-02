package com.example.demo.goal;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/goal")
@AllArgsConstructor
public class GoalController {
    private final GoalService goalService;


    @PostMapping("/create")
    public ResponseEntity<goal> savegoalDto(@RequestBody goal goal) {
        return new ResponseEntity<goal>(goalService.saveGoal(goal), HttpStatus.OK);
    }
}
