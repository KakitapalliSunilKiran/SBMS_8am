package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ParentA;

@RequestMapping("api/v1")
@RestController
public class EntryController {
	
	
	@Autowired
	ParentA p;

// @Qualifier("c")
//	@Autowired
//	public void setP( ParentA p) {
//		this.p = p;
//	}
	
	
//	public EntryController(@Qualifier("b") ParentA p) {
//		super();
//		this.p = p;
//	}

	

	@GetMapping("/fetch") 
	public String getMessage() {
		return p.getInfo();
	}


}
//1 weekend - 2.5 hrs entire Spring security total 5 hrs
//2 weekend - 2.5 hrs microservices end to end application total 5 hrs
