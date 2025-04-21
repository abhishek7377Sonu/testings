package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	//private ResponseEntity<String> responseEntity;

	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg(@RequestParam("name")String name){
		
		String resPayload= name + " , welcome to Ashok IT";
		
           return  new ResponseEntity<>(resPayload,HttpStatus.OK);
//localhost:8080/greet?name=abhi  This url run in the postman tool
	}
	
	@GetMapping("/greet")
	public String getGreetMsg(){
		  
		String resPayload="Good morning abhishek";
		
           return  resPayload;
        //localhost:8080/greet  This url run in the postman tool
	}
}
