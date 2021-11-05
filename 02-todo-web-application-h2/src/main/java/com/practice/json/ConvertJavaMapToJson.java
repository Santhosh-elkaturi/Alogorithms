package com.practice.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertJavaMapToJson {

	public static void main(String[] args) throws JsonProcessingException {
		
		ObjectMapper ob = new ObjectMapper();
		
		String jsonInString = "";
        
        List<String> addesss = new ArrayList<>();
        addesss.add("Paris");
        addesss.add("London");

        // Create Map
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("empId", 11);
        map.put("name", "Ankit");
        map.put("address", addesss);
        
        System.out.println(map);
        
        System.out.println(ob.writeValueAsString(map));
        System.out.println(ob.writerWithDefaultPrettyPrinter().writeValueAsString(map));
	}
}
