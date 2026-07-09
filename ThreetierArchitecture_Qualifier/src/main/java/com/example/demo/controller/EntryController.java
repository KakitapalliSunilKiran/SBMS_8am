package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ParentA;

@RequestMapping("api/v1")
@RestController
public class EntryController {
	
	@Autowired
	ParentA p;
	
	@GetMapping("/fetch")
	public String getMessage() {
		return p.getInfo();
	}

}
