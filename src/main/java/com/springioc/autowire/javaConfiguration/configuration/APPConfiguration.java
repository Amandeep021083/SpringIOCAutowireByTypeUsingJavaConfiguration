package com.springioc.autowire.javaConfiguration.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springioc.autowire.javaConfiguration.beans.Car;
import com.springioc.autowire.javaConfiguration.beans.User;

@Configuration
public class APPConfiguration {
	
	@Bean
	public Car car(){
		return new Car("Duster", 32445532);
	}
	
	@Bean
	public User user(){
		return new User(car());
	}
}
