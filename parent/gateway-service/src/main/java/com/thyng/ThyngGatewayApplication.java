package com.thyng;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@EnableZuulProxy
@SpringBootApplication
@EnableDiscoveryClient
public class ThyngGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThyngGatewayApplication.class, args);
	}

	@Bean
	public ZuulFilter authorizationHeaderFilter() {
		return new ZuulFilter() {

			@Override
			public Object run() {
				final RequestContext requestContext = RequestContext.getCurrentContext();
				final HttpServletRequest request = requestContext.getRequest();
				final Principal principal = request.getUserPrincipal();
				if(null != principal && principal instanceof OAuth2Authentication) {
					final OAuth2Authentication authentication = (OAuth2Authentication)principal;
					final OAuth2AuthenticationDetails details = (OAuth2AuthenticationDetails)authentication.getDetails();
					requestContext.addZuulRequestHeader("Authorization", details.getTokenType()+" "+details.getTokenValue());
				}
				return null;
			}

			@Override
			public boolean shouldFilter() {
				return true;
			}

			@Override
			public int filterOrder() {
				return 0;
			}

			@Override
			public String filterType() {
				return "pre";
			}

		};
	}

}
