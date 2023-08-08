package com.springbootkafka.projeto.a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

	@Autowired
	KafkaProducerService kafkaProducerService;
	
	@PostMapping("/kafka/{message}")
    public void sendMessage(@PathVariable String message) {	
		kafkaProducerService.sendMessage(message);
		System.out.println("mensagem enviada = " + message);
    }
}
