package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"controladores"})
public class M6Grupal4Application {

	public static void main(String[] args) {
		SpringApplication.run(M6Grupal4Application.class, args);
	}

}
