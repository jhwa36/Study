package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	
	public static void main(String[] args) {
		
		String hr = "\n"+"---------------------------------------------------------------"+"\n";
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/Bean.xml");
		
		UserService service = factory.getBean("service",UserServiceImpl.class);
		
		//1. applicationContext.xml에서 UserDto 객체를 만들자.
		//2. MTest에서 service.addUser() argument로 1번에서 만든 객체를 넣어주자.
		
		UserDto userdto = factory.getBean("userdto",UserDto.class);
		service.addUser(userdto);
		System.out.println(userdto.getName());
		System.out.println(userdto.getMyDate());
		
		
		System.out.println(hr);
		
		UserDto birthdto = factory.getBean("birthdto",UserDto.class);
		service.addUser(birthdto);
		System.out.println(birthdto.getName());
		System.out.println(birthdto.getMyDate());
		
		System.out.println(hr);
		
		UserDto christmas = factory.getBean("dto",UserDto.class);
		service.addUser(christmas);
		System.out.println(christmas.getName());
		System.out.println(christmas.getMyDate());
		
	}
	
}
