package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.BusineesLayer;

@RestController
public class EntryController {
	
//	@Autowired
	private BusineesLayer bl;
	
	public EntryController(BusineesLayer bl) 
	{
		super();
		System.out.println("I am in constructor Injection");
			this.bl = bl;
     }
	
	@Autowired
	public void setBl(BusineesLayer bl) 
	{
		System.out.println("I am in setter Injection");
		this.bl=bl;
	}
	
	
	public BusineesLayer getBl() {
		return bl;
	}






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
