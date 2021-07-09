package com.boot.azureapp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AzureAppApplication {
	
	@ResponseBody
	@GetMapping("/")
	public String getAll() {
		return "Hello Hari";	
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureAppApplication.class, args);
	}

}
