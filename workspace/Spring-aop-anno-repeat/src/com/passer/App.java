package com.passer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.passer.domain.Student;
import com.passer.service.IStudentService;

@SpringJUnitConfig
public class App {
	@Autowired
	private IStudentService studentService;
	
	@Test
	void testSave() throws Exception {
		System.out.println(studentService.getClass());
		studentService.save(new Student());
	}
	
	@Test
	void testUpdate() throws Exception {
		studentService.update(new Student());
	}
	
}
