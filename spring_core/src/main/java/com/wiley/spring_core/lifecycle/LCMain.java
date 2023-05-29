package com.wiley.spring_core.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

import com.wiley.spring_core.cl.Person;

public class LCMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context= 
    			new ClassPathXmlApplicationContext("com/wiley/spring_core/lifecycle/config.xml");
		Pizza p1=(Pizza) context.getBean("pizza1");
		System.out.println(p1);
	}

}
