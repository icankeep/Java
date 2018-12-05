package com.passer.di_setter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class App {

	@Autowired
	private Cat cat;
	
	@Autowired
	private Person person;
	
	@Autowired
	private CollectionDemo collection;
	@Test
	void test1() throws Exception {
		System.out.println(cat);
	}
	
	@Test
	void test2() throws Exception {
		System.out.println(person);
	}
	
	@Test
	void test3() throws Exception {
		System.out.println(collection);
	}
}
