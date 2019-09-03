package com.hello.mvc03;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hello.mvc03.dto.CustomerDto;
import com.hello.mvc03.model.biz.CustomerBiz;

@Controller
public class HomeController {
	
	@Autowired
	private CustomerBiz biz;
	
	@RequestMapping(value ="/list.do",method = RequestMethod.GET )
	public String selectList(Model model) {
		model.addAttribute("list",biz.selectList());
		return "boardlist";
	}
	@RequestMapping(value = "/selectone.do",method = RequestMethod.GET)
	public String selectOne(String id, Model model) {
		model.addAttribute("dto",biz.selectOne(id));
		return "selectOne";
	}
	
	@RequestMapping(value ="/insert.do",method = RequestMethod.GET )
	public String insert() {
		return "insert";
	}
	
	@RequestMapping(value = "/insertres.do",method = RequestMethod.POST)
	public String insertRes(@ModelAttribute CustomerDto dto, Model model) {
		int res = biz.insert(dto);
		System.out.println(dto.getName());
		if(res>0) {
			model.addAttribute("list",biz.selectList());
			return "boardlist";
		}else {
			model.addAttribute("insert",biz.insert(dto));
			return "insert";
		}
	}
	
	@RequestMapping(value = "/update.do",method =RequestMethod.GET)
	public String update(Model model, String id) {
		model.addAttribute("dto",biz.selectOne(id));
		return "update";
	}
	
	@RequestMapping(value = "/updateres.do", method = RequestMethod.POST)
	public String updateres(CustomerDto dto, String id, Model model) {
		int res = biz.update(dto);
		if ( res> 0) {
			model.addAttribute("dto",biz.selectOne(id));
			return "selectOne";
		}else {
			return "update";
		}
	}
	@RequestMapping(value = "/delete.do",method=RequestMethod.GET)
	public String delete(String id, Model model) {
		int res = biz.delete(id);
		if(res > 0) {
			model.addAttribute("list",biz.selectList());
			return "boardlist";
		}else {
			System.out.println("실패"); 
			return "selectOne";
			
		}
	}
	
	@RequestMapping(value = "/loginform.do")
	public String login() {
		return "login";
	}
	
	@RequestMapping(value = "/loginajax.do")	// 해당 id랑 pw가 맞는게 있으면? session에 바로 담아버릴거에여
	@ResponseBody
	public Map<String, Boolean> loginAjax(String id, String pw, HttpSession session) {
		// @ResponseBody : java 객체를 response 객체에 binding
		// Map 객체 응답?? ligbchk 를 가진 boolean
		// jackson json관련된 라이브러리  map의 형태를 
		CustomerDto dto = biz.login(id, pw);
		boolean loginchk = false;
		
		
		if(dto != null) {//id랑 pw 가 제대로 동작했다 or 들어갔다는 뜻 	/ 		dto.getId()가 != null이 아니라면
			session.setAttribute("dto", dto);
			loginchk = true;
		}
		
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		map.put("loginchk", loginchk);
		
		return map;
	}
	
	@RequestMapping("/test.do")
	public String test() {
		biz.test();
		
		return "redirect:list.do";
		// setvlet에서의 sendRedircet
	}
}
