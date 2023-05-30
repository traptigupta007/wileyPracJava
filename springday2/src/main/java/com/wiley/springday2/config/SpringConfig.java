package com.wiley.springday2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.wiley.springday2.config")
public class SpringConfig {
	@Bean
	public Beer getBeer() {
		return new Beer();
	}
	@Bean
public Student getStudent() {
	Student student=new Student(getBeer());
	return student;
}
}
