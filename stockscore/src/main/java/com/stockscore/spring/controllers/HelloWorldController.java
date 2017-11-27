package com.stockscore.spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {
	// Read
	@GetMapping("/hello")
	public String greeting() {
		return "Hello world";
	}

}