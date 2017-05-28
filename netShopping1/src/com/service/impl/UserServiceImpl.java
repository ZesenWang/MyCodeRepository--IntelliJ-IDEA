package com.service.impl;

import java.util.List;

import com.dao.UserDao;
import com.po.User;
import com.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public String loginService(User user) {
		// TODO Auto-generated method stub
		String hql="from User where username='"+user.getUsername()+"' and password='"+user.getPassword()+"'";
		List<User> list=this.userDao.getData(hql);
		if(list.size()>0){
			return "success";
		}
			
		return "error";
	}

	@Override
	public String regService(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
