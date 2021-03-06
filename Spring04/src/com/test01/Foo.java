package com.test01;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Foo {
	
	String hr = "\n"+"------------------------------------------------"+"\n";
	
	Bar bar;
	
	public Foo() {
		System.out.println("Foo 객체 생성");
		System.out.println(hr);
	}
	
	public Foo(Date date) {
		System.out.println("Foo(date) 객체 생성 : " + date);
		System.out.println(hr);
	}
	
	public void setBar(Bar bar) {
		this.bar = bar;
		System.out.println("setBar(bar) 호출");
		System.out.println(hr);
	}
	
	public void setDate(Date date) {
		System.out.println("setDate() 호출 : " + date);
		System.out.println(hr);
	}
	
	public void setNum(int num) {
		System.out.println("setNum() 호출 : " + num);
		System.out.println(hr);
	}
	
	public void setStudent(String[] student) {
		System.out.println("setStudent() 호출");
		
		for(String person : student) {
			System.out.println(person);
		}
		System.out.println(hr);
	}
	
	public void setInfo(List<String> item) {
		System.out.println("setInfo() 호출 ");
		for(String res : item) {
			System.out.println(res);
		}
		System.out.println(hr);
	}
	
	public void setSeason(Map<String, String>season) {
		System.out.println("setSeason() 호출");
		Set<String> Keys =season.keySet();
		for(String key : Keys) {
			System.out.println(key + "의 계절 : " + season.get(key));
		}
		System.out.println(hr);
	}
	
	public void setScore(List<Score> score) {
		System.out.println("setScore() 호출");
		
		for(Score sc : score) {
			System.out.println(sc);
		}
		System.out.println(hr);
	}
}
