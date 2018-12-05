package com.passer.smis.domain;

import lombok.Getter;
import lombok.Setter;

//用户类,定义用户信息的一些字段
@Getter@Setter
public class User {

	private Long id;  		//用户id
	private String name;	//用户名称
	private int age;		//用户年龄
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
