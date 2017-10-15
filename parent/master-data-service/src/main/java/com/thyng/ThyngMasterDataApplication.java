package com.thyng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

@EnableOAuth2Client
@EnableDiscoveryClient
@SpringBootApplication
public class ThyngMasterDataApplication   {
	
	public static void main(String[] args) {
		SpringApplication.run(ThyngMasterDataApplication.class, args);
	}
	
}
