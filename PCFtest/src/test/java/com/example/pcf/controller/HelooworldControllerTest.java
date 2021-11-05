package com.example.pcf.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.pcf.service.HelloworldService;

@WebMvcTest(HelloWorldController.class)
@RunWith(SpringRunner.class)
public class HelooworldControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Mock
	HelloworldService helloserice;

	
	@Test
	public void testHelloworld() throws Exception {
		
		RequestBuilder request = MockMvcRequestBuilders.get("/sayHello").accept(MediaType.APPLICATION_JSON);
		MvcResult actual = mockMvc.perform(request).andExpect(status().isOk()).andReturn();
		assertEquals("SayHello", actual.getResponse().getContentAsString());
		
	}
	
	@Test
	public void testMessage() throws Exception {
		
		 when(helloserice.getMessage()).thenReturn("helloservice");
		RequestBuilder request = MockMvcRequestBuilders.get("/getMessage").accept(MediaType.APPLICATION_JSON);
		MvcResult actual = mockMvc.perform(request).andExpect(status().isOk()).andReturn();
		assertEquals("helloservice", actual.getResponse().getContentAsString());
		
	}

}
