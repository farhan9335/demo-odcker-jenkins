package com.example.demodockerjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoDockerJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDockerJenkinsApplication.class, args);
	}
	
	@GetMapping(path = "/welcome")
	public String welcomeMessage() {
		return "Welcome, this is first demo of docker and jenkins";
	}
	
	@GetMapping(path = "/second")
	public String secondMessage() {
		return "Welcome, this is second demo of docker and jenkins";
	}

}
