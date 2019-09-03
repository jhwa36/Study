package com.hello.mvc03.model.dao;

import java.util.List;

import com.hello.mvc03.dto.CustomerDto;

//왜 인터페이스로 만듦??

public interface CustomerDao {
	
	String namespace = "customer.";
	
	public List<CustomerDto> selectList();
	public CustomerDto selectOne(String id);
	public int insert(CustomerDto dto);
	public int update(CustomerDto dto);
	public int delete(String id);
	
	public CustomerDto login(String id, String pw);
	public String test();
	
}
