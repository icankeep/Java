package com.passer.di_constructor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class App {

	//@Autowired
	private Employee employee;
	
	@Autowired
	private Department department;
	
	@Test
	void test1() throws Exception {
		System.out.println(employee);
	}
	
	@Test
	void test2() throws Exception {
		System.out.println(employee);
		System.out.println(department);
	}
}
