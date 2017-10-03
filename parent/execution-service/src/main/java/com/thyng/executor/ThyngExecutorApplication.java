package com.thyng.executor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class ThyngExecutorApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ThyngExecutorApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ThyngExecutorApplication.class);
	}
	
}
