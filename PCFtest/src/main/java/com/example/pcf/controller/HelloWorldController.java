package com.example.pcf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pcf.service.HelloworldService;

@RestController
public class HelloWorldController {

	
	@Autowired
	private HelloworldService helloworldService;
	
	@GetMapping(value = "/sayHello")
	public String sayHello() {
		return "SayHello";
	}
	
	@GetMapping(value = "/getMessage")
	public String getMessage() {
		return helloworldService.getMessage();
	}
}
