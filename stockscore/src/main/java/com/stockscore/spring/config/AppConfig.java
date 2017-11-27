package com.stockscore.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc

// tell Spring to scran everything under com.stockscore
// how Spring works: initializer -> config -> scan 'com.stockscore'
@ComponentScan(basePackages = "com.stockscore")
public class AppConfig {
	
}