package com.test05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		
		ApplicationContext beans = new ClassPathXmlApplicationContext("com/test05/beans.xml");
		
		Developer bean = (Developer) beans.getBean("dev");
		System.out.println(bean);
		
		Engineer bean2 = beans.getBean("eng",Engineer.class);
		System.out.println(bean2);
	}
}
