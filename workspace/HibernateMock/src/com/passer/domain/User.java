package com.passer.domain;

import com.passer.anno.ID;
import com.passer.anno.Table;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Table("t_user")
public class User {
	
	@ID
	private Long id;
	private String name;
	private Integer age;
	
	public User() {
		
	}
	
	public User(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
