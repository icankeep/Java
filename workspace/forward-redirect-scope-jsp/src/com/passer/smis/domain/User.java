package com.passer.smis.domain;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class User {
	
	private Long id;
	private String name;
	private Integer age;
	
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
