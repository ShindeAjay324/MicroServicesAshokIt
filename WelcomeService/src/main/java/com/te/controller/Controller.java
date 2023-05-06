package com.te.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.client.GreetApiClient;

@RequestMapping(path = "/welcome")
@RestController
public class Controller {
	
	@Autowired
	private GreetApiClient apiClient;
	
	@GetMapping(path = "/msg")
	public String add() {
		String greet= apiClient.invokeGreetApi();
		String welcome= "welcome to Banglore";
		return greet+" "+welcome;
	}

}
