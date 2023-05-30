package com.wiley.springday2.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com\\wiley\\springday2\\stereotype\\config.xml");
		Student student=context.getBean("student",Student.class);
		System.out.println(student);
	}

}
