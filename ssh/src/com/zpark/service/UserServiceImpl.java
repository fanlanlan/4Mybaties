package com.zpark.service;

import com.zpark.dao.UserDAO;
import com.zpark.entity.User;

public class UserServiceImpl implements UserService{
	private UserDAO userDAO;
	
	/**
	 * @return the userDAO
	 */
	public UserDAO getUserDAO() {
		return userDAO;
	}

	/**
	 * @param userDAO the userDAO to set
	 */
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public void register(User user) {
		System.out.println("------------service-------------");
		userDAO.save(user);
		
	}

	

}
