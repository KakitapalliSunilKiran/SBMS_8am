package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ChildB implements ParentA{

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "i am from Child B";
	}
	
	

}
