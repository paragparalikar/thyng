package com.thyng.security.oauth2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;

@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

	@Autowired
	private ResourceServerTokenServices resourceServerTokenServices;

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers(HttpMethod.GET, "/users").access("#oauth2.hasScope('read_users')")
				.antMatchers(HttpMethod.PUT, "/users/**").access("#oauth2.hasScope('write_users')")
				.antMatchers(HttpMethod.POST, "/users/**").access("#oauth2.hasScope('write_users')")
				.antMatchers(HttpMethod.PATCH, "/users/**").access("#oauth2.hasScope('write_users')")
				.antMatchers(HttpMethod.DELETE, "/users/**").access("#oauth2.hasScope('write_users')")
				.antMatchers(HttpMethod.GET, "/things").access("#oauth2.hasScope('read_things')")
				.antMatchers(HttpMethod.GET, "/things/**").access("#oauth2.hasScope('read_things')");
	}

	@Override
	public void configure(ResourceServerSecurityConfigurer config) {
		config.tokenServices(resourceServerTokenServices);
	}

}