package com.springboot.moulali.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App1Controller {

	@GetMapping("/hello")
	public String m1()
	{
		return "Hello";
	}
}
