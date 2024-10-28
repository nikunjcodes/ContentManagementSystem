package com.cms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/api/articles/**").permitAll() // Allow access to articles API
                        .anyRequest().authenticated() // Require authentication for any other request
                )
                .csrf(AbstractHttpConfigurer::disable // Disable CSRF for testing (not recommended for production)
                );
        return http.build();
    }
}
