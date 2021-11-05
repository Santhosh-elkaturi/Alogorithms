package com.example.pcf.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@WebMvcTest(ItemController.class)
public class ItemControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testItemController() throws Exception {

		RequestBuilder request = MockMvcRequestBuilders.get("/getItem").accept(MediaType.APPLICATION_JSON);
		mockMvc.perform(request).
				andExpect(status().isOk()).
				andExpect(content().json("{itemId:2,itemName:Icecrem,price:100}")).
				andReturn();
	}
}
