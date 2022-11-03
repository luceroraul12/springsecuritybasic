package com.security.springsecuritybasic.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                .antMatchers("/account/**","/balance/**","/cards/**","/loans/**").authenticated()
                .antMatchers("/contact/**","/notice/**").permitAll()
                .and().formLogin()
                .and().httpBasic();
        return http.build();
    }
}
