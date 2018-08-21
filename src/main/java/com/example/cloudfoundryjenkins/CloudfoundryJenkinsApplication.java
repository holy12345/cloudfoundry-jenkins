package com.example.cloudfoundryjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CloudfoundryJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudfoundryJenkinsApplication.class, args);
	}

	@RequestMapping("/")
	public String index() {
		return "This is cloundfoundry jenkins i hope success...";
	}
}
