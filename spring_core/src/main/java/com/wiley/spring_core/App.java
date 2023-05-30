package com.wiley.spring_core;

import org.springframework.context.*;
import org.springframework.context.support.*;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student wst1 = (Student) context.getBean("student1");
		System.out.println(wst1);

	}
}
