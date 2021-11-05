package com.practice.json;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToMap {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
	
        try {
               ObjectMapper objectMapper = new ObjectMapper();

               String jsonInString = "{\"empId\":11,\"name\":\"Ankit\",\"address\":[\"Paris\",\"London\"]}";

               System.out.println("jsonInString = " + jsonInString);
               Map<String, Object> map = new HashMap<String, Object>();
               map = objectMapper.readValue(jsonInString, new TypeReference<Map<String, Object>>() {
			});
               
System.out.println(map);
               
	}finally {
		
	}

}
}