package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {
	
	@GetMapping("/momohara")
	public String getMomohara() {
		return "TodoSecurity/momohara";
	}

}
