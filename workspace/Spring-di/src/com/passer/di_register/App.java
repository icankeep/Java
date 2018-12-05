package com.passer.di_register;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.passer.di_register.action.StudentAction;

@SpringJUnitConfig
public class App {

	@Autowired
	private StudentAction action;
	
	@Test
	void test() throws Exception {
		action.execute();
	}
	
}
