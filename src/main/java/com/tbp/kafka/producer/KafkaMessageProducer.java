package com.tbp.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaMessageProducer {
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	@Value("${kafka.topic}")
	String topic;
	
	public void sendMessage(String message) {
		kafkaTemplate.send(topic, message);
	}

}
