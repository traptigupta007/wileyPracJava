package com.wiley.spring_core.cl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= 
    			new ClassPathXmlApplicationContext("com/wiley/spring_core/cl/ciconfig.xml");
		Person p1=(Person) context.getBean("p1");
		System.out.println(p1);
			
}
}
