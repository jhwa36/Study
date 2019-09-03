package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/Beans.xml");
		
		Address hong = (Address)factory.getBean("hong");
		System.out.println(hong);
		
		Address lee = (Address)factory.getBean("lee");
		System.out.println(lee);
		
		Address kim = (Address)factory.getBean("kim");
		System.out.println(kim);
		
		//JobAddress jHong = (JobAddress)factory.getBean("jHong");
		JobAddress jHong = factory.getBean("jHong",JobAddress.class);
		//위에처럼 형 변환 해줘도 되고 아래처럼 써도 된다. 편한걸로 써라
		
		System.out.println(jHong);
		
		JobAddress jlee = factory.getBean("jlee",JobAddress.class);
		System.out.println(jlee);
		
		JobAddress jKim = factory.getBean("jKim",JobAddress.class);
		System.out.println(jKim);
				
	}
	
}
