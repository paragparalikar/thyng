package com.thyng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ThyngDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThyngDiscoveryApplication.class, args);
	}

}
