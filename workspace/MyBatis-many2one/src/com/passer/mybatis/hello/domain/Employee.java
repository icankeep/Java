package com.passer.mybatis.hello.domain;

import lombok.Getter;
import lombok.Setter;
@Getter@Setter
public class Employee {
	private Long id;
	private String name;
	private Department dept;
	
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}
