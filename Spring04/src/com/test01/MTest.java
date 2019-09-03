package com.test01;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		String hr = "\n"+"------------------------------------------------"+"\n";
		
		ApplicationContext bean = new ClassPathXmlApplicationContext("com/test01/Bean.xml");
		
		Bar bar = (Bar)bean.getBean("bar");
		bar.pr();
		
		System.out.println(hr);
		
		Foo foo = bean.getBean("foo",Foo.class);
		((ClassPathXmlApplicationContext) bean).close();
	}
}
