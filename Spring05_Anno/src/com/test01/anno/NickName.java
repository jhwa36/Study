package com.test01.anno;

import org.springframework.stereotype.Component;

// <bean id="nickName" class="com.test01.anno.NickName"/>    이 한 줄을 @Component로 정의 자동으로 첫 글자는 소문자로 bean 객체를 생성해줌
@Component
public class NickName {
	
	public NickName() {}
	
	public String toString() {
		return "별명 : 학생"; 
	}
}
