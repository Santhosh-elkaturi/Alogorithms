package com.kafka.prodconsm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringbootKafkaProdconsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootKafkaProdconsApplication.class, args);
	}

}
