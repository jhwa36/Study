package com.hello.mvc03.common.aop;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// CCC에다가 befor after 만들었었음


public class LogAop {
	
					//CC가 들어옴 실제호출되는 target
	public void before(JoinPoint join) {
		Logger logger = LoggerFactory.getLogger(join.getTarget()+"");
		
		logger.info("----------logger start----------");
		Object args[] = join.getArgs();
		if(args != null) {
			logger.info("Method : " + join.getSignature().getName());
			for(int i = 0; i < args.length; i++) {
				System.out.println(i+"번째 : " + args[i]);
			}
		}
		/*
		 * .getTarget() : 대상 객체
		 * .getArgs() : 대상 파라미터
		 * .getSignature : 대상 메서드 정보
		 */
	}

	public void after(JoinPoint join) {
		Logger logger = LoggerFactory.getLogger(join.getTarget()+"");
		logger.info("----------logger end----------");
	}
					// afterThrowing = 오류났을때 사용
	public void afterThrowing(JoinPoint join) {
		Logger logger = LoggerFactory.getLogger(join.getTarget()+"");
		logger.info("error : "+join.getArgs());
		logger.info("error : "+join.getTarget());
		
	}
}

// 

// 어디다 붙일건지 :

// proxy가 target인 척 붙여주는 것