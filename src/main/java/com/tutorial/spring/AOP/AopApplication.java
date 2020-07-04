package com.tutorial.spring.AOP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AopApplication {

	public static void main(String[] args) {
		System.out.println("Aplication staruted");
		SpringApplication.run(AopApplication.class, args);
		System.out.println("Aplication end");
	}

}
