package com.action;

import com.opensymphony.xwork2.ActionContext;
import com.po.User;
import com.service.UserService;

public class UserAction {

	private String useName;
	private String pwd;
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String getUseName() {
		return useName;
	}

	public void setUseName(String useName) {
		this.useName = useName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String login(){
		User user=new User();
		user.setUsername(this.useName);
		user.setPassword(this.pwd);
		
		String strMess=this.userService.loginService(user);
		if(strMess.equals("success")){
			ActionContext.getContext().getSession().put("userName", this.useName);
			System.out.println(this.useName);
			return "loginSuccess";
		}
		return "loginError";
	}
	
}
