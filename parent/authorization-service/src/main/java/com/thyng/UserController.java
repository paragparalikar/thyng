package com.thyng;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

@RestController
@SessionAttributes("authorizationRequest")
public class UserController {

	@ResponseBody
	@RequestMapping("/user")
	public Principal user(final Principal principal) {
		return principal;
	}
	
}
