package com.springboot.k8s.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/test-docker")
	public String getData() {
		return "Welcome' ! to Springboot deployment in Docker as Docker Image and k8";
	}
}
