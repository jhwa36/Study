package com.hello.mvc03.model.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.mvc03.dto.CustomerDto;
import com.hello.mvc03.model.dao.CustomerDao;
import com.hello.mvc03.model.dao.CustomerDaoImpl;

@Service
public class CustomerBizImpl implements CustomerBiz{
	@Autowired
	private	CustomerDao dao;
	
	@Override
	public List<CustomerDto> selectList() {
		
		return dao.selectList();
	}

	@Override
	public CustomerDto selectOne(String id) {
		
		return dao.selectOne(id);
	}

	@Override
	public int insert(CustomerDto dto) {
		
		return dao.insert(dto);
	}

	@Override
	public int update(CustomerDto dto) {
		
		return dao.update(dto);
	}

	@Override
	public int delete(String id) {
		
		return dao.delete(id);
	}

}
