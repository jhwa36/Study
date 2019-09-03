package com.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		
		ApplicationContext beans = new ClassPathXmlApplicationContext("com/test04/beans.xml");
		
		Developer you = (Developer) beans.getBean("you");
		System.out.println(you);
		
		Engineer kang = beans.getBean("kang",Engineer.class);
		System.out.println(kang);
	}
}
