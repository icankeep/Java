package com.passer.introspector;

import java.util.Date;

public class User {
	private String name;
	private Integer age;
	private String descri;
	private Date birthday;
	
	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age =age;
	}


	public String getDescri() {
		return descri;
	}


	public void setDescri(String descri) {
		this.descri = descri;
	}


	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", descri=" + descri + ", birthday=" + birthday + "]";
	}


	
}
