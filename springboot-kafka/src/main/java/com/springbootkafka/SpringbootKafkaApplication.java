package com.springbootkafka;

import com.springbootkafka.projeto.a.KafkaProducerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class SpringbootKafkaApplication implements CommandLineRunner {

	@Autowired
    private KafkaProducerService producerService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootKafkaApplication.class, args);
	}
	
	@Override
    public void run(String... args) {
        producerService.sendMessage("Hello, Kafka!");
    }

}
