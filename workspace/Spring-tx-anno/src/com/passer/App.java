package com.passer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.passer.service.IAccountService;

@SpringJUnitConfig
public class App {
	
	@Autowired
	private IAccountService service;
	@Test
	void testAccount() throws Exception {
		service.trans(10086L, 10010L, 1000);
	}
}
