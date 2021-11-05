package com.kafka.prodconsm.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.kafka.prodconsm.entity.Employee;

@Component
public class KafkaProducer {

	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	KafkaTemplate<String, Object> kafkaTemplate1;
	
	@Value("${topic.name}")
	String topic;
	
	public void sendMesage(String message) {
		
		kafkaTemplate.send(topic, message);
	}
	
	@Value("${topic.name1}")
	String topic1;
	
	public void sendMesage(Employee employee) {
		
		kafkaTemplate1.send(topic1, employee);
	}
	
}
