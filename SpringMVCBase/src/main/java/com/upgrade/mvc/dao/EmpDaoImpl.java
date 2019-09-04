package com.upgrade.mvc.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.upgrade.mvc.dto.EmpDto;

@Repository
public class EmpDaoImpl implements EmpDao{
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<EmpDto> selectList() {
		
		List<EmpDto> list = null;
		
		try {
			list = sqlSession.selectList(namespace+"selectlist");
		} catch (Exception e) {
			System.out.println("SELECT LIST ERROR"); // Logger로도 해볼 것
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public EmpDto selectOne(int empno) {
		
		EmpDto dto = new EmpDto();
		
		try {
			dto = sqlSession.selectOne(namespace+"selectOne",empno);
		} catch (Exception e) {
			System.out.println("SELECT ONE ERROR");
			e.printStackTrace();
		}
		return dto;
	}

	@Override
	public int insert(EmpDto dto) {
		return 0;
	}

	@Override
	public int update(EmpDto dto) {
		return 0;
	}

	@Override
	public int delete(int empno) {
		return 0;
	}

}
