package com.bank.securityConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	
	public SecurityFilterChain securityFilterChain(HttpSecurity http) {
		http.csrf().disable().authorizeRequests().ant
	}
}
