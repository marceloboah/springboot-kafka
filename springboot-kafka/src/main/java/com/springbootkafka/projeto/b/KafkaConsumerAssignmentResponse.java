package com.springbootkafka.projeto.b;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class KafkaConsumerAssignmentResponse {
    private String topic;
    private Integer partition;
}
