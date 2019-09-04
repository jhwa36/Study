package com.hello.mvc3.common.interceptor;

import javax.servlet.http.HttpServletRequest;


import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {
	
	Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

	@Override		//preHandle : Controller가 수행되기 전에 호출 (이후 Controller를 수행할지 여부는 boolean으로 return함)
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		logger.info("[INTERCEPTOR] preHandle");
		
		// spring 3.2 이상 servlet-context.xml에서 <exclude-mapping-path>를 사용할 수 있다.
		if(request.getRequestURI().contains("/loginform.do")||request.getRequestURI().contains("/loginajax.do")) {
			return true;
		}
		
		
		// session에 로그인하면 dto에 담기는데 null이라면
		if(request.getSession().getAttribute("dto") == null) {
			response.sendRedirect("/mvc3");
			return false;
		}
		
		// controller 정상 동작 여부
		return true;
	}

	@Override		// postHandle : Controller가 수행된 후 View를 호출하기 전 호출
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		logger.info("[INTERCEPTOR] postHandle");
	}

	@Override		// View 작업까지 완료한 후 호출 ( @ResponseBody를 이용할 경우 UI에 이미 값을 전달한 후 해당부분이 호출 됨)
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		logger.info("[INTERCEPTOR] afterCompletion");
	}

}
