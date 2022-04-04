package com.zensar;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.bind.annotation.RequestBody;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloRestControllerTest {

	@Autowired // autowiring for MockMVC
	private MockMvc mock;

	@Test
	public void getmessageTest() throws Exception {

		mock.perform(MockMvcRequestBuilders.get("/hello")).andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("Welcome to Jenkins Learning"));

	}
	
	@Test
	public void createMessageTest() throws Exception {
		
		mock.perform(MockMvcRequestBuilders.post("/greet").content("Welcome"))
		.andExpect(MockMvcResultMatchers.status().isCreated())
		.andExpect(MockMvcResultMatchers.content().string("Message Created Welcome"));
		
	}

}
