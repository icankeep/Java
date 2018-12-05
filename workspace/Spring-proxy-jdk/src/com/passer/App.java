package com.passer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.passer.domain.Student;
import com.passer.service.IStudentService;
import com.passer.tx.TransactionManagerAdvice;

@SpringJUnitConfig
public class App {
	
	@Autowired
	private TransactionManagerAdvice advice;
	@Test
	void test() throws Exception {
		IStudentService proxy = advice.getProxyObject();
		proxy.save(new Student());
	}
}
