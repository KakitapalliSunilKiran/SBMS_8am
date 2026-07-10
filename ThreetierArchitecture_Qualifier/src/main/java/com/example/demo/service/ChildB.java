package com.example.demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("b")
public class ChildB implements ParentA{

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "i am from Child B";
	}
	
	

}
