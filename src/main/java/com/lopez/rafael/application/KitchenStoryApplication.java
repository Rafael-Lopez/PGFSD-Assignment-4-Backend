package com.lopez.rafael.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScans({
		@ComponentScan("com.lopez.rafael.config"),
		@ComponentScan("com.lopez.rafael.controller"),
		@ComponentScan("com.lopez.rafael.service"),
})
@EntityScan("com.lopez.rafael.model")
@EnableJpaRepositories("com.lopez.rafael.repository")
public class KitchenStoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(KitchenStoryApplication.class, args);
	}

}
