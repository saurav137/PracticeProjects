package com.projects.kafka.controller;


import com.projects.kafka.request.KafkaMessageProducerRequest;
import com.projects.kafka.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.pattern.PathPattern;

@RestController
public class KafkaRestController {


    @Autowired
    private KafkaService kafkaService;

    @PostMapping("v1/kafka/publish")
    public String publishKafkaMessage(@RequestBody KafkaMessageProducerRequest request){
        System.out.println(request.getMessage());
        kafkaService.sendMessage(request.getMessage());
        return "messagePublishedSuccussfully";
    }
}
