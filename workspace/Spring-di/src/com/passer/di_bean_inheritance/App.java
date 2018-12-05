package com.passer.di_bean_inheritance;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class App {

	@Autowired
	private SomeBean1 bean1;
	@Autowired
	private SomeBean2 bean2;
	@Test
	void test1() throws Exception {
		System.out.println(bean1);
		System.out.println(bean2);
	}
	
}
