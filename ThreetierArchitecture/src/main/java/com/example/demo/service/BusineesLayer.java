package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.DatabaseLayer;

@Service
public class BusineesLayer {
	@Autowired
	DatabaseLayer dl;
	
	public String save() {
		return dl.save();
	}

}
