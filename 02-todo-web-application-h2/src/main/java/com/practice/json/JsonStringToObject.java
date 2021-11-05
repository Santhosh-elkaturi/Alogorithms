package com.practice.json;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonStringToObject {
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		
		 String jsonInString = "{\"empId\":11,\"name\":\"Ankit\",\"address\":[\"Paris\",\"London\"]}";

		 System.out.println(jsonInString);
		 
		 Employeee emp = objectMapper.readValue(jsonInString, Employeee.class);
		 System.out.println(emp);
	}

}
