package com.my.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	
	@RequestMapping(value = "/")
	public String Main() {
		System.out.println("메인");
		
		return "login/loginform";
	}
}
