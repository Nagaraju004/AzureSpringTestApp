package com.java.naga.AzureSpringTestApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureSpringTestAppApplication {

	@GetMapping("/message")
	public String message() {
		return "Advance happy birthday Bablooo :)";
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureSpringTestAppApplication.class, args);
	}

}
