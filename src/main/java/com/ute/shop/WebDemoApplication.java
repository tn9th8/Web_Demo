package com.ute.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebDemoApplication.class, args);
	}
	
	@GetMapping("hello")
	public String simpleRequest() {
		return "Hello. You are successful";
	}
	
	@GetMapping("")
	public String hello(@RequestParam(name = "name") String name) {
		return "Hello " + name;
	}

}
