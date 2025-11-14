package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	
	/**by using the filed injection
	@Autowired
	StudentService service;
	**/
	
	
	/**
	  by using the setter injection
	 if we want optional filed with not mandatory then use setter injection
	 if we not have use Qualifier and have multipal services classes then we need to Autowired(require=false)
	**/
	private StudentService service;
	
	@Autowired
     public void setfees(@Qualifier("schooleServiceImpl") StudentService service) {
    	 this.service=service;
     }
     
	
	/**constructor injection if we need mandatory 
	   here we not Autowired
	private StudentService service;
	
	
	 StudentController(StudentService service){
		 this.service=service;
		
	}
	**/
	
	@GetMapping("/print")
	public String getfees() {
		return service.printfees();
		
	}

}
