package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component("c")
public class ChildC implements ParentA{

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "I am From Child C";
	}

}
