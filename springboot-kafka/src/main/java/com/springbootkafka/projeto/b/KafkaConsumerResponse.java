package com.springbootkafka.projeto.b;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class KafkaConsumerResponse {
    private String consumerId;
    private String groupId;
    private String listenerId;
    private Boolean active;
    private List<KafkaConsumerAssignmentResponse> assignments;
}
