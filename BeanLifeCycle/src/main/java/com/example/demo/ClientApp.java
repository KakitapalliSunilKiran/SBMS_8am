package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class ClientApp {
	
	@Autowired
	ServerApp s;
	
	ClientApp(){
		System.out.println("I am in ClientApp"+this.hashCode());
	}
	
	@PostConstruct
	void initialize123() {
		System.out.println("I am in initialize method"+s.hashCode()+s.test());
	}
	
	@PreDestroy
	void destroy() {
		System.out.println("I am in Destroy Method");
	}
	

    
}
