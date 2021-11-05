package com.example.pcf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan
public class PcFtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PcFtestApplication.class, args);
	}
	
	

}
