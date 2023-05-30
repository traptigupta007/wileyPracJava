package com.wiley.spring_core.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pizza {
private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public Pizza(double price) {
	super();
	this.price = price;
}

public Pizza() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Pizza [price=" + price + "]";
}
@PostConstruct
public void init() {
	System.out.println("Inside init method");
}
@PreDestroy
public void destroy() {
	System.out.println("inside the destroy method");
}
}
