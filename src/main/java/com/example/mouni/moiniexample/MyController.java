package com.example.mouni.moiniexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class MyController {
	
	@GetMapping("/test")
	public String test() {
		return "dFNKJZ CDKS DJMh";
	}

}
