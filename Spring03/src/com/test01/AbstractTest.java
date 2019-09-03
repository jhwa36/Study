package com.test01;

import java.util.Calendar;
import java.util.GregorianCalendar;

//언제 추상클래스?
//언제 인터페이스?
public abstract class AbstractTest {
	
	public static AbstractTest getInstance() {
		
		GregorianCalendar cal = new GregorianCalendar();
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(day) {
		case 1: return new Sunday();
		case 2: return new Monday();
		case 3: return new Tuesday();
		case 4: return new Wednesday();
		case 5: return new Thursday();
		case 6: return new Saturday();
		case 7: return new Sunday();
		}
		
		return null;
	}
	
	public abstract String dayInfo();
}
