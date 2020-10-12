package com.tbp.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tbp.kafka.producer.KafkaMessageProducer;

@RestController
public class KafkaController {
	@Autowired
	KafkaMessageProducer  kafkaMessageProducer;
	@PostMapping("/pushMessage")
	public String postMessage(@RequestBody String message) {
		kafkaMessageProducer.sendMessage(message);
		return "Message Published";
	}

}
