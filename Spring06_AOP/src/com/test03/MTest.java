package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MTest {
	
	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");
		
		System.out.println("남자 입장");
		Person m = factory.getBean("man",Person.class);
		m.classWork();
		System.out.println("-------------------------");
		
		System.out.println("여자 입장");
		Person w = factory.getBean("woman",Person.class);
		w.classWork();
	}
}
