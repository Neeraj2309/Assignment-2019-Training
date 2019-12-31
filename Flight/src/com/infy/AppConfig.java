package com.infy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.infy.service.FlightService;
import com.infy.service.FlightServiceImpl;

@Configuration
@ComponentScan(basePackages = "com.infy")
@EnableAspectJAutoProxy
public class AppConfig {

	@Bean
	public FlightService flightService() {
		
		return new FlightServiceImpl();
	}
}
