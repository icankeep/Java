package com.passer.junit4;
/*
 * JUnit测试单元
 */
public class JUnit4{

	@MyBefore
	public void before() throws Exception{
		System.out.println("before...");
	}
	@MyAfter
	public void after() throws Exception{
		System.out.println("after...");
	}
	
	@MyTest
	public void test1() throws Exception{
		System.out.println("测试1");
	}
	
	@MyTest
	public void test2() throws Exception{
		System.out.println("测试2");
	}

}
