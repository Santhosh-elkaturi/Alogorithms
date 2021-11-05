package com.practice.json;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertJavaObjectToJson {

	public static void main(String[] args) throws JsonProcessingException {
		
		ObjectMapper objectMapper =  new ObjectMapper();
		 List<String> addesss = new ArrayList<>();
         addesss.add("Paris");
         addesss.add("London");
         
         Employeee employee = new Employeee(11, "Ankit", addesss);
         System.out.println(employee);
         String writeValueAsString = objectMapper.writeValueAsString(employee);
         System.out.println(writeValueAsString);
         
         String stringVal = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
         System.out.println(stringVal);
	
	}
}
