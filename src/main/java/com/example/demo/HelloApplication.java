package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
	@GetMapping(value = "/hello")
	public String hello() {
		return "hello!!sdalkfjsdalkfjsdalk;fjsadl;kfjlsa;fdljsk";
	}
}
