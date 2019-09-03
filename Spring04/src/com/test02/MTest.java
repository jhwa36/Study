package com.test02;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/Bean.xml");
		
		MemberInfo obj = (MemberInfo)factory.getBean("member"); //memberInfo Class 객체 불러옴
		int num = (int)(Math.random()*2);	//0과 1이 랜덤으로 돌게되고
		
		if(num == 0) {
			String message = factory.getMessage("title", null, "default Message", Locale.getDefault());
			//			properties에 있는			(title이라는애, ?, title이라는애 못찾으면 나올 메세지, label_locale.properties에서 locale에 들어갈 값)
			System.out.println(message);
			System.out.println();
			obj.display(Locale.getDefault());
		}else {
			String message = factory.getMessage("title", null, "default Message", Locale.ENGLISH);
			System.out.println(message);
			System.out.println();
			obj.display(Locale.ENGLISH);
		}
	}
}
