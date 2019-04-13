package com.springioc.autowire.javaConfiguration.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springioc.autowire.javaConfiguration.beans.User;
import com.springioc.autowire.javaConfiguration.configuration.APPConfiguration;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(APPConfiguration.class);
		User user = (User)context.getBean("user");
		System.out.println(user.getCar().getName());
	}

}
