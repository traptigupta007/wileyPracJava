package com.wiley.spring_core.reftype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= 
    			new ClassPathXmlApplicationContext("com\\wiley\\spring_core\\reftype\\configref.xml");
		
		WileyA wa= (WileyA)context.getBean("waref");
		
		System.out.println(wa.getOb().getCount());

	}

}