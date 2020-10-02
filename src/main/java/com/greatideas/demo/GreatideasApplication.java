package com.greatideas.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class GreatideasApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreatideasApplication.class, args);
	}

}
