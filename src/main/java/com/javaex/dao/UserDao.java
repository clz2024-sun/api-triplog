package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.UserVo;

@Repository
public class UserDao {

	@Autowired
	private SqlSession sqlSession;
	
	
	public List<UserVo> selectUserList(){
		System.out.println("UserDao.selectUserList()");
		
		return sqlSession.selectList("user.select");
	}
}
