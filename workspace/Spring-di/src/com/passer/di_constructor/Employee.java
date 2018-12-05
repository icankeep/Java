package com.passer.di_constructor;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class Employee {
	private String name;
	private Integer age;
	private BigDecimal salary;
	
	public Employee(String name, Integer age, BigDecimal salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
}
