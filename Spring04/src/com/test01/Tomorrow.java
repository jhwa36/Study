package com.test01;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Tomorrow {
	
	public static void getTomorrow() {
					//factory-method 사용할 때 메소드 앞 타입이 클래스를 따라야 작동함. return은 null이어도 상관 없다. 왜인지는 모르겠음.
		
	 Calendar cal = new GregorianCalendar();
	    cal.add(Calendar.DATE, 1);
	    
	    System.out.println("내일 시간 구하기 : " + cal.getTime());
	    
	}
	
}
