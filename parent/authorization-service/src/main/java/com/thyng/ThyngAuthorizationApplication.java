package com.thyng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ThyngAuthorizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThyngAuthorizationApplication.class, args);
	}
	
}
