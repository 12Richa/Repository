package com.example.demo.caching;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@EnableConfigurationProperties
@ConfigurationProperties(prefix="formapp")
public class AppProperties {

	private Map<String, String> messages=new HashMap<>();

	public Map<String, String> getMessages() {
		return messages;
	}

	public void setMessages(Map<String, String> messages) {
		this.messages = messages;
	}
	
	
 
}//class