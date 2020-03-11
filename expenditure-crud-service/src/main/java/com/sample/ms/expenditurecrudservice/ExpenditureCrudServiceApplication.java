package com.sample.ms.expenditurecrudservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sample.ms.expenditurecrudservice")
public class ExpenditureCrudServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenditureCrudServiceApplication.class, args);
	}

}
