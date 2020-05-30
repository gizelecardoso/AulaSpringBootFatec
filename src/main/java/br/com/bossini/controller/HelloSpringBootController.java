package br.com.bossini.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HelloSpringBootController {

	@GetMapping("/hello")
	public String hello() {
		return "hello_spring_boot";
	}
	
	
	
}
