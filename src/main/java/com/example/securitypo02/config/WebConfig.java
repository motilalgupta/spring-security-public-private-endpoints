package com.example.securitypo02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http){
        http.authorizeHttpRequests(auth -> auth
                .requestMatchers("/","/about","/contactUs").permitAll()
                .requestMatchers("/transfer","/admin").authenticated()
        ).formLogin(Customizer.withDefaults());

        return http.build();
    }
}
