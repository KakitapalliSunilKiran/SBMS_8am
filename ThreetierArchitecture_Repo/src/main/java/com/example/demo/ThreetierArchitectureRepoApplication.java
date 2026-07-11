package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Student;
import com.example.demo.service.BusineesLayer;

@SpringBootApplication
public class ThreetierArchitectureRepoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(ThreetierArchitectureRepoApplication.class, args);
//		    RepoLayer rl = ctx.getBean(RepoLayer.class);
//		    
////		    Parent p = new Child();
//		    System.out.println(rl.getClass());
		
		BusineesLayer bl = ctx.getBean(BusineesLayer.class);
		Student obj = new Student(100,"Sunil","VIT UNiversity",80);
		bl.saveData(obj);
	}

}
