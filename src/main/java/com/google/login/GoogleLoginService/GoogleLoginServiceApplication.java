package com.google.login.GoogleLoginService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.google.*")
public class GoogleLoginServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoogleLoginServiceApplication.class, args);
	}

}
