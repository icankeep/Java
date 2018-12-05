package com.passer.container;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class ContainerTest {

	@Autowired
	Person person;
	
	@Autowired
	ApplicationContext ctx;
	
	@Autowired
	BeanFactory factory;
	
	/*
	loading...
	---------------
	com.passer.container.Person@6ebf0f36
	 */
	@Test
	void testBeanFactory() throws Exception {
		System.out.println("---------------");
		System.out.println(person);
		
		System.out.println(ctx);
		System.out.println(factory);
	}
}
