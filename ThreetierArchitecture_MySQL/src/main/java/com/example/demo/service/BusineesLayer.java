package com.example.demo.service;

import java.util.Optional;

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
	
	public Optional<Student> getData(Integer id) {
		return rl.findById(id);
	}
	
	public Student updateData(Integer id) {	
		Student s = rl.findById(id).get();
		s.setName("AAAAAA");
		return rl.save(s);	
	}
	
	public void deleteData(Integer id) {
		 rl.deleteById(id);
	}
	
	
}
//Parent p = new Child();
//save()
//findById
//deleteById

