package com.bank.securityConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	
	public SecurityFilterChain securityFilterChain(HttpSecurity http) {
		// added comments for testing purpose 
		return null;
//		http.csrf().disable().authorizeRequests().ant
	}
}
