package com.example.thmtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController
{
	@GetMapping("/hello")
	public String syaHello(){
		return "Hi!";
	}

}
