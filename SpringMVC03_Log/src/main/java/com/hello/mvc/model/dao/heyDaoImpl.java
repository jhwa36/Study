package com.hello.mvc.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hello.mvc.model.dto.heyDto;

@Repository
public class heyDaoImpl implements heyDao{
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<heyDto> selectList() {
		return null;
	}

	@Override
	public heyDto selectOne(String id) {
		return null;
	}

	@Override
	public int insert(heyDto dto) {
		return 0;
	}

	@Override
	public int update(heyDto dto) {
		return 0;
	}

	@Override
	public int delete(String id) {
		return 0;
	}

}
