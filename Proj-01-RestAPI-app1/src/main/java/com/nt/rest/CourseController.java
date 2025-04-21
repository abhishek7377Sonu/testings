package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@GetMapping("/course")
	public ResponseEntity <String> getCourseFee(@RequestParam("cname") String cname, 
			                                                                               @RequestParam ("tname")String tname) {
		
		String respBody = cname + " By " + tname  + " fee is 7000 INR ";
		
		return new ResponseEntity<>(respBody,HttpStatus.OK);
		
	}
}
//localhost:8080/course?cname=html&tname=sudhakar    run in postman tool

/*cname=course name
tname= trainer name*/