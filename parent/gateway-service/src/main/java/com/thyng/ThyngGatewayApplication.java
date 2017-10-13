package com.thyng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy	
@SpringBootApplication
public class ThyngGatewayApplication  {
	
	public static void main(String[] args) {
		SpringApplication.run(ThyngGatewayApplication.class, args);
	}
	
}
