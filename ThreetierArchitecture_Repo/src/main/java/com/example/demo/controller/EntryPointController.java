package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<String> doSave(@RequestBody Student s) {
	    bl.saveData(s);
	    return ResponseEntity.status(HttpStatus.CREATED)
	                         .body("Student saved successfully");
	}
	
	@GetMapping("/fetch/{id}")
	public ResponseEntity<Student> getData(@PathVariable("id") Integer id) {

	    Optional<Student> student = bl.getData(id);

	    if (student.isPresent()) {
	        return ResponseEntity.ok(student.get());
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}
	//localhost:8080/api/v1/fetch/100
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Student> updateData(@PathVariable Integer id) {

	    Student student = bl.updateData(id);
	    if (student != null) {
	        return ResponseEntity.ok(student);
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteData(@PathVariable Integer id) {

	    bl.deleteData(id);

	    return ResponseEntity.noContent().build();
	}
	
	//Data Jpa
	//MySql connector

}
