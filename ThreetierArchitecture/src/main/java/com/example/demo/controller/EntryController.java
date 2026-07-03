package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntryController {
	
	@GetMapping("/fetch")
	public String getMessage() {
		return "Welcome to Duragsoft";
	}
	
	//React Application
	//UI
	//browser url
	//Postman
	//Hoppscotch

}
//7.30 to 9 
//@Get Mapping : if you are developing an Api, if its fetching some data then annotate
//it as GetMapping

//@PostMapping : if you are developing an API , if its persisting the data in db 
// then go for post mapping

//@PutMapping : if you are trying to update the Record that is put Mapping 

//@Delete Mapping: if you are trying to remove the record from the DB , ie put Mapping

//@PatchMapping and 
//what is difference between post and put

//@RestController -> to indicate it is controller Layer 
//@Service -> to indicate it is service layer
//@Repository class -> to indicate it is Repository class

