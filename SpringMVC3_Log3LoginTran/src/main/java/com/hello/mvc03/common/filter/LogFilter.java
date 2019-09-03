package com.hello.mvc03.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogFilter implements Filter {

	private Logger logger = LoggerFactory.getLogger(LogFilter.class);
	
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		req.setCharacterEncoding("UTF-8");
		
		String remoteAddr = StringUtils.defaultString(req.getRemoteAddr()+"");
		
		String uri = StringUtils.defaultString(req.getRequestURI());
		String url = StringUtils.defaultString(req.getRequestURL().toString());
		String queryString = StringUtils.defaultString(req.getQueryString());
		
		String referer = StringUtils.defaultString(req.getHeader("referer"));
		String agent = StringUtils.defaultString(req.getHeader("User-Agent"));
		
		StringBuffer sb = new StringBuffer();
		sb.append("\n")
		  .append("remoteAddr : " + remoteAddr+"\n") // 클라이언트 ip v6 주소가 나옴. ip v4로 나오게 하려면?
		  .append("uri : " + uri + "\n") // web apllication root부터 
		  .append("url : " + url + "\n") // location 이기때문에 처음부터 끝까지
		  .append("queryString : " + queryString + "\n") // ? key = value 
		  .append("referer : " + referer + "\n") // 이전페이지 정보  없으면 null
		  .append("agent : " + agent + "\n"); //  접속정보 어떤 브라우저로 접속했는지 어떤 환경인지
		
		logger.info("[로그 필터!!!!!!!!!!!]" + sb.toString());
		 
		chain.doFilter(req, response);
	}

	@Override
	public void destroy() {
		
	}

}
