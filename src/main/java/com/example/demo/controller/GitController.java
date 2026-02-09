package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GitController {

	
	@GetMapping("/hi")
	public String test() {

    	return "This is GitHUb";
    	
    	//hiiiii
    }
	
	/*
	 * public String pending() { int i = 0;
	 * 
	 * if(i == 0) { return "value true"; }
	 * 
	 * 
	 * }
	 */
}


