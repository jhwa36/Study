package com.hello.mvc.model.biz;

import java.util.List;

import com.hello.mvc.model.dto.heyDto;

public interface heyBiz {

	public List<heyDto> selectList();
	public heyDto selectOne(String id);
	public int insert(heyDto dto);
	public int update(heyDto dto);
	public int delete(String id);
}
