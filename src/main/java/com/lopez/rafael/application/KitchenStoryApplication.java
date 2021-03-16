package com.lopez.rafael.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScans({
		@ComponentScan("com.lopez.rafael.config"),
		@ComponentScan("com.lopez.rafael.controller"),
})
public class KitchenStoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(KitchenStoryApplication.class, args);
	}

}
