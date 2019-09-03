package com.hello.mvcsetting.biz;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hello.mvcsetting.dto.CustomerDto;

@Service
public interface CustomerBiz {
	
	public List<CustomerDto> selectList();
	public CustomerDto selectOne(String id);
	public int insert(CustomerDto dto);
	public int update(CustomerDto dto);
	public int delete(String id);
}
