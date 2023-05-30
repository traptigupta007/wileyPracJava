package com.wiley.springday2.config;

import org.springframework.stereotype.Component;

//@Component("student1")
public class Student {
	
	public Student(Beer beer) {
		super();
		this.beer = beer;
	}
	public Beer getBeer() {
		return beer;
	}
	public void setBeer(Beer beer) {
		this.beer = beer;
	}
	private Beer beer;
	public void study() {
		beer.display();
		System.out.println("studetn is studyign");
	}
}
