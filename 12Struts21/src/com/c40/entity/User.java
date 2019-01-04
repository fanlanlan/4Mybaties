package com.c40.entity;

/**参数接收
 * url?users[0].name=c40&users[0].age=18&users[0].id=1&users[1].name=c40&users[1].age=18&users[1].id=1
 * user.id=1&user.age=19&user.name=nanna
 * 
 * <form>
 * 	<input type="text" name="user.name"/>
 * 	<input type="text" name="user.age"/>
 * 	<input type="text" name="user.id"/>
 * 
 * </form>
 * action:   private String name;
 * 			 private Integer age;
 * 			 private Integer  id;
 * 			 private User   user;
 * 			 private List<User> users;
 * 
 * @author Administrator
 *参数接收测试实体
 */
public class User {
	private Integer id;
	private String name;
	private Double salary;
	private Boolean gender;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
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
	 * @return the salary
	 */
	public Double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	/**
	 * @return the gender
	 */
	public Boolean getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(Boolean gender) {
		this.gender = gender;
	}
	/**
	 * @return the user40
	 */
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", salary=" + salary
				+ ", gender=" + gender +   "]";
	}
	

}
