package com.test02;

public class MTest {
	//약결합
	public static void main(String[] args) {
		MessageBean bean = new MessageBeanEn();
		bean.sayHello("Spring");
		
		bean = new MessageBeanKo();
		bean.sayHello("스프링");
	}

}
