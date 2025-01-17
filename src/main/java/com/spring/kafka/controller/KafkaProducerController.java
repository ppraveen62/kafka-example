package com.spring.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaProducerController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "test-topic1";

    @GetMapping("/publish/{message}")
    public String publishMessage(@PathVariable("message") String message) {
        kafkaTemplate.send(TOPIC, message);
        return "Message Published!";
    }
}
