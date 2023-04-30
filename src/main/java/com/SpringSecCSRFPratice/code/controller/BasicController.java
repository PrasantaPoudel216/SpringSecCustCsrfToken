package com.SpringSecCSRFPratice.code.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BasicController {

	
	
	@GetMapping(value="/home")
	public String home()
	{
		
		return "home.html";
	}

	@PostMapping(value="/savedata")
	public String savedata(String username,String _falame){
		System.out.println(username);
		System.out.println(_falame);
	
		return "home.html";
		
		
	}
	
	
	
}
