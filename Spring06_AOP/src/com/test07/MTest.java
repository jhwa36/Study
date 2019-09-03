package com.test07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test07/beans.xml");
		
		MessageBean mb = factory.getBean("proxy",MessageBean.class);
		mb.sayHello();
	} 
}
