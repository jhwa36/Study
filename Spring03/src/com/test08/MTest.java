package com.test08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		
		ApplicationContext beans = new ClassPathXmlApplicationContext("com/test08/beans.xml");
		
		TV samsongtv = (SamsongTV) beans.getBean("samsong");
		samsongtv.powerOn();
		samsongtv.powerOff();
		samsongtv.volumeUp();
		samsongtv.volumeDown();
		
		// 객체를 가져다가 필요한시점에 필요한 것만 가져다 쓰고싶을때 속성이 있음.
		// lazy-init (생성을) lazy=늦게하겠다, 나중에하겠다 는 뜻
		
		TV lztv = beans.getBean("lz",LzTV.class);
		lztv.powerOn();
		lztv.powerOff();
		lztv.volumeUp();
		lztv.volumeDown();
	}
}
