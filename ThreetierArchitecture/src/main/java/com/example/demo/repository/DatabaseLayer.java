package com.example.demo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class DatabaseLayer {
	
	public String save() {
		return "Hey I am in Db Layer";
	}

}
