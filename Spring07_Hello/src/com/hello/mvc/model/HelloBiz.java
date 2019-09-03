package com.hello.mvc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// TODO : 005.biz(@Service)
@Service
public class HelloBiz {
	
	//선언만 해놓고 autowired 자동으로 객체를 만든걸 주입해주고있음
	@Autowired
	private HelloDao dao;
	
	// TODO : 008. biz에서 return "Hello, mvc"
	public String getHello() {
		return "Hello, " + dao.getHello();
	}
}
