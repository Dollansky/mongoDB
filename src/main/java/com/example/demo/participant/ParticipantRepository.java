package com.example.demo.participant;

import com.example.demo.blacklist.BlackList;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ParticipantRepository extends MongoRepository<Participant, Long> {
}
