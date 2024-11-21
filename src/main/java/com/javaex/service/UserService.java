package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.UserDao;
import com.javaex.vo.UserVo;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public List<UserVo> exeSelectUserList(){
		System.out.println("UserService.exeSelectUserList()");
		
		return userDao.selectUserList();
	}
}
