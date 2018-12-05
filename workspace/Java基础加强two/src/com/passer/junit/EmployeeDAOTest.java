package com.passer.junit;

public class EmployeeDAOTest {
	
	@MyBefore
	public void init() {
		System.out.println("init...");
	}
	
	@MyTest
	public void testSave() throws Exception {
		System.out.println("save...");
	}
	
	@MyTest
	public void testDelete() throws Exception {
		System.out.println("delete...");
	}
	
	@MyAfter
	public void destroy() {
		System.out.println("destroy...");
	}
}
