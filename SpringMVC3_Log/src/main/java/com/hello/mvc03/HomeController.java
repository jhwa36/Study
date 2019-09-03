package com.hello.mvc03;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	
	@RequestMapping(value = "/loginform.do", method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(value = "/loginajax.do", method = RequestMethod.GET)
	public String loginform() {
		
		return "login";
	}
	
}
