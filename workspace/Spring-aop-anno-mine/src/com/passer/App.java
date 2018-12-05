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
	void testSave() throws Exception {
		System.out.println(service.getClass());
		service.save(new Student());
	}

	@Test
	void testUpdate() throws Exception {
		service.update(new Student());
	}
}
