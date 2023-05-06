package com.te.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/client")
@RestController
public class Controller {
	
	@Autowired
	private Environment env;
	
	@ResponseStatus(value = HttpStatus.OK)
	@GetMapping(path = "/goodmorning")
	public String greet() {
		String portNumber=env.getProperty("server.port");
		return "good morning ..! [ PORT :: "+ portNumber+"]  ";
	}
}
