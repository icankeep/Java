package com.passer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.passer.domain.Student;
import com.passer.log.LogAdvice;
import com.passer.service.StudentService;

@SpringJUnitConfig
public class App {
	
	@Autowired
	private LogAdvice advice;
	
	@Test
	void test() throws Exception {
		StudentService proxy = advice.getProxyObject();
		proxy.save(new Student());
	}
}
