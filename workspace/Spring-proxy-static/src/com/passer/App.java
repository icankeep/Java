package com.passer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.passer.domain.Student;
import com.passer.service.IStudentService;

@SpringJUnitConfig
public class App {
	
	@Autowired
	private IStudentService service;
	@Test
	void test() throws Exception {
		service.save(new Student());
	}
	
	@Test
	void test2() throws Exception {
		service.update(new Student());
	}
}
