package com.test06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		
		ApplicationContext beans = new ClassPathXmlApplicationContext("com/test06/beans.xml");
		
		Developer devBean = (Developer) beans.getBean("dev");
		System.out.println(devBean);
		
		Engineer engBean = beans.getBean("eng",Engineer.class);
		System.out.println(engBean);
	}
}
