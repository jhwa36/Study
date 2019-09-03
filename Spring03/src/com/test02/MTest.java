package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		
		
		ApplicationContext beans = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		
		BirthDto bean = beans.getBean("birth",BirthDto.class);
		
		System.out.println(bean.getName());
		System.out.println(bean.getBirth());
		// 1. 왼쪽 짝궁으 이름과 생일을 setter를 사용하여 값을 주입하고 출력
		// 2. 오른쪽 짝궁의 이름과 생일을 생성자를 사용하여 값을 주입하고 출력
		// 3. 내 이름과 생일을 값을 주입하고 출력
		bean = beans.getBean("birth2",BirthDto.class);
		System.out.println(bean.getName());
		System.out.println(bean.getBirth());
		
		bean = (BirthDto) beans.getBean("birth3");
		System.out.println(bean.getName());
		System.out.println(bean.getBirth());
	}
}
