package com.hello.mvcsetting.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hello.mvcsetting.dto.CustomerDto;

@Repository
public interface CustomerDao {
	
	String namespace ="customer.";
	
	
	public List<CustomerDto> selectList();
	public CustomerDto selectOne(String id);
	public int insert(CustomerDto dto);
	public int update(CustomerDto dto);
	public int delete(String id);
	
}
