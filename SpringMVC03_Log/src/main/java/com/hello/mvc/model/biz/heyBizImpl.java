package com.hello.mvc.model.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.mvc.model.dao.heyDao;
import com.hello.mvc.model.dto.heyDto;

@Service
public class heyBizImpl implements heyBiz {
	
	@Autowired
	private heyDao dao;
	
	@Override
	public List<heyDto> selectList() {
		return dao.selectList();
	}

	@Override
	public heyDto selectOne(String id) {
		return dao.selectOne(id);
	}

	@Override
	public int insert(heyDto dto) {
		return dao.insert(dto);
	}

	@Override
	public int update(heyDto dto) {
		return dao.update(dto);
	}

	@Override
	public int delete(String id) {
		return dao.delete(id);
	}

}
