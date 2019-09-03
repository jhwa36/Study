package com.hello.mvc2;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hello.mvc2.model.HelloBiz;

@Controller
public class HomeController {
	
	@Autowired
	private HelloBiz biz;
	
	@RequestMapping("/hello.do")
	public String getHello(Model model) {
		
		//request.setAttribute("msg",biz.getHello());
		model.addAttribute("hello_message", biz.getHello());
		return "hello";
	}
	
	@RequestMapping("/bye.do")	//Model model,  name의 이름과 변수가 같으면 
	//public ModelAndView getBye(@RequestParam("name") String name) {
	public String getBye(Model model , String name) {
		
		model.addAttribute("bye_message","Bye, "+name);
		
		return "bye";
	}
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	//get 방식으로 넘어온 mapping 접근
	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}
