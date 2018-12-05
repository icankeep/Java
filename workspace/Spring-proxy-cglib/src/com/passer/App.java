package com.passer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.passer.domain.Student;
import com.passer.service.StudentService;
import com.passer.tx.TransactionManagerAdvice;

@SpringJUnitConfig
public class App {
	
	@Autowired
	private TransactionManagerAdvice advice;
	@Test
	void test() throws Exception {
		StudentService proxy = advice.getProxyObject();
		System.out.println(proxy.getClass());
		
		proxy.save(new Student());
		
		proxy.update(new Student());
	}
}
