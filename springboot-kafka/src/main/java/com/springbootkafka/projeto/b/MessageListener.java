package com.springbootkafka.projeto.b;

import java.util.concurrent.CompletableFuture;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class MessageListener {
	
	@KafkaListener(topics = "com.faza.example.kafka.topic", id = "my-message-consumer", idIsGroup = false, autoStartup = "${spring.kafka.consumer.topic.activation-status}")
	public void kafkaMessageListener(ConsumerRecord<String, String> record) {
        log.info("Kafka message listener got a new record: " + record);
        CompletableFuture.runAsync(this::sleep)
                .join();
        log.info("Kafka message listener done processing record: " + record);
    }
    @SneakyThrows
    private void sleep() {
        Thread.sleep(5000);
    }
}


