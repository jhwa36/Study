package com.test01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAdvice {
		//execution(public * com.test01.Human.sayName(..)) = pointcut 어디에 붙을건데?? 어디에 출력할건데??		
	@Before("execution(public * com.test01.Human.sayName(..))")
	public void beforeSaying(JoinPoint join) {
		System.out.println("당신의 이름은 무엇입니까?");
		
	}
	@After("execution(public * com.test01.Human.sayName(..))") //return 위에 붙게 된다.
	public void afterSaying(JoinPoint join) {
		System.out.println("이름이 멋지시네요");
	}
	@AfterReturning("execution(public * com.test01.Human.sayName(..))")
	public void afterReturnSaying(JoinPoint join) {
		System.out.println("직업이 무엇입니까?");
	}
}
