package com.kafka.prodconsm.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import com.kafka.prodconsm.entity.Employee;

@Component
public class KafkConsumer {
	
	@KafkaListener(topics = "${topic.name}")
	public void receiveMessage(Message<String> message) {
		
		String payload = message.getPayload();
		System.out.println(payload);
	}

	@KafkaListener(topics = "${topic.name1}",groupId = "tbd")
	public void receiveMessageJson(Employee message) {
		
		 Employee payload = message;
		System.out.println(payload);
	}
	
}
