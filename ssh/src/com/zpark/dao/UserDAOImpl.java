package com.zpark.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.zpark.entity.User;

public class UserDAOImpl implements UserDAO{
	private HibernateTemplate hibernateTemplate;
	
	/**
	 * @return the hibernateTemplate
	 */
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	/**
	 * @param hibernateTemplate the hibernateTemplate to set
	 */
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void save(User user) {
		System.out.println("-----------dao---------------");
		hibernateTemplate.save(user);
		
	}


}
