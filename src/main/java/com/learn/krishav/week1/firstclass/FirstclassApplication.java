package com.learn.krishav.week1.firstclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   // entry point of springboot application
public class FirstclassApplication implements CommandLineRunner {

	@Autowired
	Apple obj;

	public static void main(String[] args) {
		SpringApplication.run(FirstclassApplication.class, args);

	}


	@Override
	public void run(String... args) throws Exception {

		obj.eatApple();

	}
}
