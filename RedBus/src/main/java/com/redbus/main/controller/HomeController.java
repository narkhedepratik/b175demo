package com.redbus.main.controller;

import org.springframework.aot.hint.annotation.Reflective;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	
	public String preLogin()
	{
		return "home.jsp";
	}
}
