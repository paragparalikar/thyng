package com.thyng.aggregator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class ThyngAggregatorApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ThyngAggregatorApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ThyngAggregatorApplication.class);
	}
	
	
}
