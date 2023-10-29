package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"controllers","services"})
public class SpilcaProject10Application {

	public static void main(String[] args) {
		SpringApplication.run(SpilcaProject10Application.class, args);
	}

}
