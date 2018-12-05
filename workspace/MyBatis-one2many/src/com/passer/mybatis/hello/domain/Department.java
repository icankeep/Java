package com.passer.mybatis.hello.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Department {
	private Long id;
	private String name;
	private List <Employee> emps = new ArrayList<>();
	
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
}
