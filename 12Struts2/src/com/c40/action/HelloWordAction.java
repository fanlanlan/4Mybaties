package com.c40.action;

public class HelloWordAction {

	/**
	 * @param args
	 * struts2后控制器
	 * 允许pojo格式的后控制器定义方式
	 */
	public String abc(){
		
		System.out.println("hilo!!!!!!!");
		return "ok40";//返回字符串，用于选择视图，匹配视图名
	}
}
