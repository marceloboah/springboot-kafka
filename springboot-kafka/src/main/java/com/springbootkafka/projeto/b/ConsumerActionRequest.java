package com.springbootkafka.projeto.b;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ConsumerActionRequest {
    @Builder.Default
    private long timestamp = System.currentTimeMillis();
    private String consumerId;
    private ConsumerAction consumerAction;
}