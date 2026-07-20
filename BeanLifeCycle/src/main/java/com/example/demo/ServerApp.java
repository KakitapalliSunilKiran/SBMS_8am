package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class ServerApp {
	
	ServerApp(){	
		System.out.println("I am in Server App");
	}

	String test() {
		return "I am in test";
	}
}
