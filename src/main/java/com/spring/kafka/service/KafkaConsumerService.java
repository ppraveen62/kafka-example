package com.spring.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "test-topic1", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Received Message: " + message);
    }
}
