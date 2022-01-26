package com.example.demo.blacklist;

import com.example.demo.timeIntervall.TimeIntervall;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/blacklist")
@AllArgsConstructor
public class BlackListController {
    private final BlackListService blackListService;


    @PostMapping("/create")
    public ResponseEntity<BlackList> saveBlacklist(@RequestBody BlackList blackList) {
        return new ResponseEntity<BlackList>(blackListService.saveBlacklist(blackList), HttpStatus.OK);
    }
}
