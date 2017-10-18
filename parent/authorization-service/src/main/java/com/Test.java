package com;

import org.springframework.security.jwt.Jwt;
import org.springframework.security.jwt.JwtHelper;

public class Test {

	public static void main(String[] args) {
		final String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1MDgzNDk4MjYsInVzZXJfbmFtZSI6IlBhcmFnIFBhcmFsaWthciIsImF1dGhvcml0aWVzIjpbIlJPTEVfVVNFUiJdLCJqdGkiOiI4NjdlODlkMC0wNDFhLTRiY2ItOWQ5Zi05ZDQxYTY4MTM4MzkiLCJjbGllbnRfaWQiOiJnYXRld2F5LXNlcnZpY2UiLCJzY29wZSI6WyJyZWFkIiwid3JpdGUiLCJ0cnVzdCJdfQ.GFVRJX5yguDskj88t3uy-hR89yWynBHtYJ96E7G4IC0";
		final Jwt jwt = JwtHelper.decode(token);
		System.out.println(jwt);
		System.out.println(jwt.getClaims());
	}

}
