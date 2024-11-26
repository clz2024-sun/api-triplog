package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.UserService;
import com.javaex.vo.UserVo;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<UserVo> getUserList(){
		System.out.println("UserController.getUserList()");
		
		
		
		return userService.exeSelectUserList();
	}
}
