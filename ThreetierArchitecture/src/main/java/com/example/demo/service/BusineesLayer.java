package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.DatabaseLayer;

@Service
public class BusineesLayer {
	//@Autowired
	private final DatabaseLayer dl;
	
	
	public BusineesLayer(DatabaseLayer dl) {
		super();
		this.dl = dl;
	}


	public String save() {
		return dl.save();
	}

}
