package com.example.orders;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	String hostName = System.getenv().getOrDefault("HOSTNAME","unknown");
	
	@RequestMapping("/hello")
	public String index(){
		return "Greeting from Spring Boot from " + hostName;
	}
}
