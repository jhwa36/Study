package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		
		ApplicationContext beans = new ClassPathXmlApplicationContext("com/test03/beans.xml");
		
		Developer dev = (Developer)beans.getBean("you");
		System.out.println(dev);
		
		Engineer eng = beans.getBean("kang",Engineer.class);
		System.out.println(eng);
		
		Emp you = (Developer) beans.getBean("you");
		Emp kang = beans.getBean("kang",Engineer.class);
		System.out.println(you);
		System.out.println(kang);
	}
}
