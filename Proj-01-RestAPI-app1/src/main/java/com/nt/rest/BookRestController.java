package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {

	@GetMapping("/book/{name}")
	public ResponseEntity<String> getBookPrice(@PathVariable("name") String name) {

		String respBody = name + " price is 400 $";

		return new ResponseEntity<String>(respBody, HttpStatus.OK);

	}

	@GetMapping("/book/name/{bname}/author/{aname}")
	public ResponseEntity<String> getBook(@PathVariable("bname") String bname, @PathVariable("aname") String aname) {

		String respBody = bname + " By " + aname + " is out of stuck";

		return new ResponseEntity<String>(respBody, HttpStatus.OK);

	}
}
