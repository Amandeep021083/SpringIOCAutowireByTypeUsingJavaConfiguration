package com.springioc.autowire.javaConfiguration.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
	
	private Car car;

	public User(Car car) {
		super();
		this.car = car;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

}
