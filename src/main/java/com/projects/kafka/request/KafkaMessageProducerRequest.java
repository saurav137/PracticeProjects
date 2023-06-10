package com.projects.kafka.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.security.DenyAll;


@AllArgsConstructor
@Data
@NoArgsConstructor
public class KafkaMessageProducerRequest {

    @JsonProperty("message")
    private String message;
}
