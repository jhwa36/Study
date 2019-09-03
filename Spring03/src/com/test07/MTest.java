package com.test07;

public class MTest {
	// 스프링과 비슷한 구조이지만 스프링은 아님
	public static void main(String[] args) {
		BeanFactory factory = new BeanFactory();
		
		TV tv = (TV) factory.getBean("Samsong");
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		
		tv = (TV) factory.getBean("Lz");
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
	}
}
