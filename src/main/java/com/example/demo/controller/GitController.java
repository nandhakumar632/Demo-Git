package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.GitService;

@RestController
@RequestMapping("/api")
public class GitController {

	
	private GitService gitService;
	public GitController() {
		this.gitService=gitService;
	}
	
	@GetMapping("/hi")
	public String test() {

		

		int age =18;

    	return "This is GitHUb";
    	
    	//hiiiii
    }
	
	
	  public String pending() { int i = 0;
	  
	  
	  gitService.back();
	  if(i == 0) 
	  { 
		  return "value true"; 
		  }
	  
	  
	  return "default";
	  
	  }
	 
}


