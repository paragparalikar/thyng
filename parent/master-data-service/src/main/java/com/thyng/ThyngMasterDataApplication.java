package com.thyng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@EnableOAuth2Client
@EnableDiscoveryClient
@SpringBootApplication
public class ThyngMasterDataApplication   {
	
	public static void main(String[] args) {
		SpringApplication.run(ThyngMasterDataApplication.class, args);
	}
	
	@Bean
	public CommonsRequestLoggingFilter requestLoggingFilter() {
		final CommonsRequestLoggingFilter filter = new CommonsRequestLoggingFilter();
		filter.setIncludeClientInfo(true);
		filter.setIncludeHeaders(true);
		filter.setIncludePayload(true);
		filter.setIncludeQueryString(true);
		return filter;
	}
	
}
