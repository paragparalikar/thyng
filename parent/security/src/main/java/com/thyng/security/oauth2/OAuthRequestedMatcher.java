package com.thyng.security.oauth2;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.web.util.matcher.RequestMatcher;

public class OAuthRequestedMatcher implements RequestMatcher {
	
	public boolean matches(HttpServletRequest request) {
		final String authorization = request.getHeader("Authorization");
		boolean haveOauth2Token = (authorization != null) && authorization.startsWith("Bearer");
		boolean haveAccessToken = request.getParameter("access_token") != null;
		return haveOauth2Token || haveAccessToken;
	}
	
}
