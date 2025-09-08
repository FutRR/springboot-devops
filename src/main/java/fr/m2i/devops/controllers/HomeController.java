package fr.m2i.devops.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

	@GetMapping
	public String Hello() {
		return "Hello";
	}
	
	@GetMapping("/admin")
	public String HelloAdmin() {
		return "Hello Admin";
	}
}
