package com.ltp.globalsuperstore;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class GlobalsuperstoreApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() {
		assertNotNull(mockMvc);
	}
	@Test
	public void testshowInventoryForm()throws Exception{
		RequestBuilder request= MockMvcRequestBuilders.get("/?id=123");

		mockMvc.perform(request)
				.andExpect(status().is2xxSuccessful())
				.andExpect(view().name("form"))
				.andExpect(model().attributeExists("item"));
	}
	@Test
	public void testSuccessfulSubmission()throws Exception{
		RequestBuilder request=MockMvcRequestBuilders.post("/submitItem")
				.param("category","Furniture")
				.param("name","chairs")
				.param("price","50000")
				.param("discount","500")
				.param("date","2015-08-11");

		mockMvc.perform(request)
				.andExpect(status().is3xxRedirection())
				.andExpect(redirectedUrl("/inventory"));
	}
//	@Test
//	public void testUnsuccessfulSubmission()throws Exception{
//		RequestBuilder request=MockMvcRequestBuilders.post("/submitItem")
//				.param("category"," ")
//				.param("name","      ")
//				.param("price","    ")
//				.param("discount","      ")
//				.param("date","      ");
//
//		mockMvc.perform(request)
//				.andExpect(status().is2xxSuccessful())
//				.andExpect(view().name("form"));
//
//	}
}
