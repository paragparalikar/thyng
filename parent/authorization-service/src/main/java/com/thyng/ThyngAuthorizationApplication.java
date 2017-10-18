package com.thyng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@EnableDiscoveryClient
@SpringBootApplication
public class ThyngAuthorizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThyngAuthorizationApplication.class, args);
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
