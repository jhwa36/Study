package com.test02;

import java.util.Locale;

public class LocaleTest {
	
	public static void main(String[] args) {
		
		Locale locale = Locale.getDefault();	
		//Locale.getDefalut() :우리가 지금 쓰고 있는 컴퓨터의 기본적인 지역
		System.out.println("locale : " + locale);
		
		Locale[] res = Locale.getAvailableLocales();
		for(Locale l : res) {
			System.out.println(l.toString()+"\t"+l.getCountry()+"\t"+l.getLanguage()+"\t"+l.getDisplayName());
		}
		
		Locale.setDefault(new Locale("fr","FRANCE","MAC"));	//defalut 설정
		Locale l = Locale.getDefault();
		System.out.println(l);
		System.out.println(l.getDisplayName());
		
		Locale.setDefault(new Locale("ko","KOREA","WIN"));
		Locale l2 = Locale.getDefault();
		System.out.println(l2);
		System.out.println(l2.getDisplayName());
		
	}
	
	
}
