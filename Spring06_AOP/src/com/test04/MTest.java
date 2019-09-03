package com.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test04/applicationContext.xml");
		
		Person w = factory.getBean("woman",Person.class);
		w.classWork();
		
		System.out.println("------------------------------");
		
		Person m = factory.getBean("man",Person.class);
		m.classWork();
	}
}
