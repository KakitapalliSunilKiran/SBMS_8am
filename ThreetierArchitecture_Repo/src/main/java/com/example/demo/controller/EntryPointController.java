package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.BusineesLayer;

@RestController
@RequestMapping("api/v1")
public class EntryPointController {
	
	@Autowired
	BusineesLayer bl;
	
	@PostMapping("/save")
	public void doSave(@RequestBody Student s) {
		bl.saveData(s);
	}
	
	@GetMapping("/fetch/{id}")
	public Optional<Student> getData(@PathVariable("id") Integer id){
		return bl.getData(id);
	}
	//localhost:8080/api/v1/fetch/100
	
	@PutMapping("/update/{id}")
	public Student updateData(@PathVariable("id") Integer id) {
		return bl.updateData(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteData(@PathVariable("id") Integer id) {
		 bl.deleteData(id);
	}
	
	

}
