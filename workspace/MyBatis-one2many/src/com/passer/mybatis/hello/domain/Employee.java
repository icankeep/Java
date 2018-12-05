package com.passer.mybatis.hello.domain;

import lombok.Getter;
import lombok.Setter;
@Getter@Setter
public class Employee {
	private Long id;
	private String name;
	private Long deptId;
	
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}
