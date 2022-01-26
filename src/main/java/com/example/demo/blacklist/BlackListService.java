package com.example.demo.blacklist;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BlackListService {

    private final BlackListRepository blackListRepository;

    public BlackList saveBlacklist(BlackList blackList){
        return blackListRepository.save(blackList);
    }
}
