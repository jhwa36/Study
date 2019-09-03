package com.test01.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		
		ApplicationContext beans = new ClassPathXmlApplicationContext("com/test01/anno/beans.xml");
		
		MyNickName my = beans.getBean("myNickName",MyNickName.class);
		System.out.println(my);
	}
}
