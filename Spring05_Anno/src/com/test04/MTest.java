package com.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	// TODO : 004. service 객체의 addUser 호출
	public static void main(String[] args) {
		ApplicationContext beans = new ClassPathXmlApplicationContext("com/test04/beans.xml");
		
		UserService user = (UserService) beans.getBean("userService");
		user.addrUser();
	}
}
