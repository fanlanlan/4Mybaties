package com.zpark.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zpark.entity.User;
import com.zpark.service.UserService;

public class UserMgMAction extends ActionSupport{
	private User user;
	private UserService userService;

	/**
	 * @return the userService
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * @param userService the userService to set
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	public String reg(){
		System.out.println("--------111111111111-----------");
		userService.register(user);
		return "success";
		
		
	}

	
}
