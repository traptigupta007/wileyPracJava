package com.wiley.springday2.task;
import org.springframework.context.*;
import org.springframework.context.support.*;

public class TaskMain {

	
	/**
	 * Hello world!
	 *
		*/
	public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("com\\wiley\\springday2\\task\\config.xml");
//			Student wst1 = (Student) context.getBean("student1");
//			System.out.println(wst1);
//			System.out.println("Mobile number:" + wst1.getPhones());
//			System.out.println("address:" + wst1.getAddress().getClass().getName());
//			System.out.println("courses:" + wst1.getCourses());
			Person p1=(Person)context.getBean("person1");
			System.out.println(p1);
		}
	}

