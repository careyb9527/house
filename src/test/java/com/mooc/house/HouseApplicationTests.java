package com.mooc.house;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class HouseApplicationTests {
	
	
	@Autowired
	private HttpClient httpClient;
	

	@Test
	public void contextLoads() throws ClientProtocolException, IOException {
		String string = httpClient.execute(new HttpGet("http://www.baidu.com")).getEntity().toString();
		System.out.println(string);
	}

}
