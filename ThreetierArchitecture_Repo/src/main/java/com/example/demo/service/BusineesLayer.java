package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repo.RepoLayer;

@Service
public class BusineesLayer {
     
	@Autowired
	RepoLayer rl;
	
	public void saveData(Student s) {
		rl.save(s);
	}
}
