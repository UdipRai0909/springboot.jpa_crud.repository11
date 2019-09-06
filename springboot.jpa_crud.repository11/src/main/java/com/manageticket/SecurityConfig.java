package com.manageticket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http
//            .authorizeRequests()
//                .anyRequest().authenticated()
//                .and()
//            .formLogin()
//                .and()
//            .httpBasic();
    	http.authorizeRequests().anyRequest().permitAll();
////      .authorizeExchange()
//      .pathMatchers("/actuator/**").permitAll()
//      .anyExchange().authenticated()
//      .and().build();
    }
//    @Bean
//    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
//        return http.authorizeExchange()
//          .pathMatchers("/actuator/**").permitAll()
//          .anyExchange().authenticated()
//          .and().build();
//    }
//    	
//    	@Override
//        protected void configure(HttpSecurity http) throws Exception {
//            http.csrf().disable().authorizeRequests().anyRequest().permitAll();
//        }
}
    
    