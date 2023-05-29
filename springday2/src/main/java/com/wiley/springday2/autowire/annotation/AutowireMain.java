package com.wiley.springday2.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AutowireMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= 
    			new ClassPathXmlApplicationContext("com\\wiley\\springday2\\autowire\\annotation\\autowireconfig.xml");
		Employee emp1= context.getBean("emp1",Employee.class);
		System.out.println(emp1);
		
	}

}
