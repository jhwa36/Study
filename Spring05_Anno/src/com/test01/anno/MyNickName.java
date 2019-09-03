package com.test01.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//<bean id="nickName" class="com.test01.anno.MyNickName"/>    이 한 줄을 @Component로 정의 자동으로 첫 글자를 소문자로 bean 객체를 생성해줌
@Component
public class MyNickName {
	
	// 자동으로 값이 주입이 됨
	@Autowired
	private NickName nickName;
	
	public MyNickName() {}

	public NickName getNickName() {
		return nickName;
	}

	public void setNickName(NickName nickName) {
		this.nickName = nickName;
	}

	@Override
	public String toString() {
		return "나의+NickName클래스 return값 =" + nickName ;
	}
	
}
