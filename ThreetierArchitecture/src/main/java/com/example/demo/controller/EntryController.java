package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.BusineesLayer;

@RestController
public class EntryController {
	
	@Autowired
	BusineesLayer bl;
//	
	@GetMapping("/fetch")
	public String getMessage() {
		
		return bl.save();
	}
	
	//React Application
	//UI
	//browser url
	//Postman
	//Hoppscotch

}
//7.30 to 9 
