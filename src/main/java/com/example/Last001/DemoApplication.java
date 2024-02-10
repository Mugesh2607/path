package com.example.Last001;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApplication {
	

	@GetMapping("/app/health")
	public ResponseEntity<String> healthCheck() {
	    String responseBody = "Have a nice day!";
	    return ResponseEntity.status(HttpStatus.OK).body(responseBody);
	}
	}
	



