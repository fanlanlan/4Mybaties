package com.c40.action;

import java.util.Date;
import java.util.List;

import com.c40.entity.User;

public class ParamAction {
	private String name;
	private Integer age;
	private Date date;
	private List<String > hobby;
	//url?user40.id=1&user40.name=haha&user40.salary=100.0&user40.gender=true&hobby=football&hobby=basktball
	private User user40;
	//url?users[0].id=1&users[0].name=haha&users[0].salary=100.0&users[0].gender=true&
	//    users[1].id=2&users[1].name=haha&users[1].salary=100.0&users[1].gender=true
	private List<User> users;
	
	

	/**
	 * @return the user40
	 */
	public User getUser40() {
		return user40;
	}



	/**
	 * @param user40 the user40 to set
	 */
	public void setUser40(User user40) {
		this.user40 = user40;
	}



	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}



	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
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
	 * @return the hobby
	 */
	public List<String> getHobby() {
		return hobby;
	}



	/**
	 * @param hobby the hobby to set
	 */
	public void setHobby(List<String> hobby) {
		this.hobby = hobby;
	}



	/**
	 * @param args
	 * 参数接收测试
	 */
	public String param40(){
		System.out.println("name:"+name+"   age:"+age);
		System.out.println("name:"+name+"   age:"+age);
		for(String h:hobby){
			System.out.println("hobby:"+h);
		}
		System.out.println("date:"+date);
		System.out.println("user:"+user40);
		System.out.println("===========");
		System.out.println("----------");
		/*for(User user:users){
			System.out.println("user:"+user);
		}
		System.out.println("&&&&&&&&&&&7");*/

		return "paramok";
	}
}
