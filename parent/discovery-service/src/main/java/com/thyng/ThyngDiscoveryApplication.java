package com.thyng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableConfigServer
@EnableEurekaServer
@EnableDiscoveryClient
@SpringBootApplication
public class ThyngDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThyngDiscoveryApplication.class, args);
	}

}
