package com.example.FirstSpringProj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstSpringProjApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstSpringProjApplication.class, args);
		
		Alien a = context.getBean(Alien.class);
		a.show();
		
		System.out.println("Welcome to boot");
	}

}
