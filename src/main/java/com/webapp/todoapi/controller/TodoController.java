package com.webapp.todoapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
	
	@GetMapping("/sayHello") 
	public String sayHello() {
		
		return "Hello from todo app again updated message";
	}

}
