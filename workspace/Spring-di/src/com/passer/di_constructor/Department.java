package com.passer.di_constructor;

import java.util.List;

import lombok.ToString;
@ToString
public class Department {
	
	private Employee employee;
	private List<String> employeeList;
	
	
	public Department(Employee employee, List<String> employeeList) {
		this.employee = employee;
		this.employeeList = employeeList;
	}
}
