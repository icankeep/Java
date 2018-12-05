package com.passer.di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class App {

	@Autowired
	private Person person;
	
	@Autowired
	private ValueBean value;
	
	@Test
	void test() throws Exception {
		System.out.println(person);
	}
	
	@Test
	void test2() throws Exception {
		System.out.println(value);
	}
}
