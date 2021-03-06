package com.thyng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ThyngDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThyngDiscoveryApplication.class, args);
	}

}
