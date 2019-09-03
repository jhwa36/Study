package com.hello.mvc.model.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hello.mvc.model.dto.heyDto;

@Repository
public interface heyDao {
	
	String namespace ="iuuiui.";
		
	public List<heyDto> selectList();
	public heyDto selectOne(String id);
	public int insert(heyDto dto);
	public int update(heyDto dto);
	public int delete(String id);
	
	
}
