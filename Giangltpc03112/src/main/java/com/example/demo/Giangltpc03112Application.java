package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"Lab1"})
public class Giangltpc03112Application {

	public static void main(String[] args) {
		SpringApplication.run(Giangltpc03112Application.class, args);
	}

}
	