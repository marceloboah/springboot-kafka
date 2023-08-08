package com.springbootkafka.projeto.a;





import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class KafkaConsumerService {

	private static final String TOPIC = "mytopic";
	private static final String TOPIC_NAME = "magic-topic";
    
    @Value("${topic.name.producer}")
    private String topicName;

    @KafkaListener(topics = TOPIC, groupId = "test-group")
    public void consume(String message) {
        System.out.println("Received message: " + message);
    }
    
    /*@KafkaListener(topics = TOPIC_NAME, groupId = "test-group")
    public void consumeGrupo2(Object message) {
        System.out.println("Received message from grupo test-group: " + message);
    }*/


    @KafkaListener(topics = "${topic.name.consumer}", groupId = "test-group")
    public void consume(ConsumerRecord<String, String> payload){
    	System.out.println(">>>>");
    	System.out.println(payload.key());
    	log.info("Tópico: {}", topicName);
        log.info("key: {}", payload.key());
        log.info("Headers: {}", payload.headers());
        log.info("Partion: {}", payload.partition());
        log.info("Order: {}", payload.value());

    }
    
    
}