package com.c40.action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

public class ParamAction {
	//定义和请求参数同名的属性，请求参数可自动接收，且可完成简单的类型转化
	private String name;
	private Integer age;
	//可接受特定规格的日期字符串，并完成自动转换  yyyy-mm-dd
	//http
	private Date birth;
	/**
	 * @return the name
	 */
	
	public String getName() {
		return name;
	}

	/**
	 * @return the date
	 */
	
	/**
	 * @return the birth
	 */
	public Date getBirth() {
		return birth;
	}

	/**
	 * @param birth the birth to set
	 */
	public void setBirth(Date birth) {
		this.birth = birth;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @param args
	 * struts2后控制器
	 * 允许pojo格式的后控制器定义方式
	 * 参数接收测试
	 * http://localhost:8888/12Struts2/***?name=c40&age=18
	 */
	public String param40(){
		
		System.out.println("param!!!!!!!");
		//1.获取当前的请求对象并收取参数
		/*HttpServletRequest req = ServletActionContext.getRequest();
		String name = req.getParameter("name");
		int age=Integer.parseInt(req.getParameter("age"));
		System.out.println("name:"+name+"     age:"+age);*/
		System.out.println("name:"+name+"     age:"+age+"   birth:"+birth);
		return "paramok";//返回字符串，用于选择视图，匹配视图名
	}
}
