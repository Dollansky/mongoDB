package com.example.demo.blacklist;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BlackListRepository extends MongoRepository<BlackList, Long> {
}
