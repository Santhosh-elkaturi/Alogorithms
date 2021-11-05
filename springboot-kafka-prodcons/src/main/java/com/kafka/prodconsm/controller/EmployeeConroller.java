package com.kafka.prodconsm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.prodconsm.entity.Employee;
import com.kafka.prodconsm.producer.KafkaProducer;

@RestController
public class EmployeeConroller {
	@Autowired
	KafkaProducer KafkaProducer;
	
	@PostMapping("/getEmployee")
	public void getEmployee(@RequestBody String message) {
		
		KafkaProducer.sendMesage(message);
	}
	
	@PostMapping("/getEmployeedata")
	public void getEmployee(@RequestBody Employee employe) {
		
		KafkaProducer.sendMesage(employe);
	}

}
