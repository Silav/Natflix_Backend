package com.spring.firstproject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class FirstspringprojectApplication {
	@Value("${server.port:8082}")
	public static void main(String[] args) {
		SpringApplication.run(FirstspringprojectApplication.class, args);
	}
	
}
