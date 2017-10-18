package com.thyng.security.oauth;

import java.util.ArrayList;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoRestTemplateCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.filter.OAuth2ClientContextFilter;

@Configuration
@EnableOAuth2Sso
public class OAuth2Configuration {

	@Bean
	public FilterRegistrationBean oauth2ClientFilterRegistration(OAuth2ClientContextFilter filter) {
		final FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(filter);
		registration.setOrder(-100);
		return registration;
	}
	
	@Bean
	@Order(Ordered.HIGHEST_PRECEDENCE)
	public UserInfoRestTemplateCustomizer userInfoRestTemplateCustomizer() {
		final UserInfoRestTemplateCustomizer userInfoRestTemplateCustomizer = new UserInfoRestTemplateCustomizer() {
			@Override
			public void customize(final OAuth2RestTemplate template) {
				template.setInterceptors(new ArrayList<>(template.getInterceptors()));
			}
		};
		return userInfoRestTemplateCustomizer;
	}

}
