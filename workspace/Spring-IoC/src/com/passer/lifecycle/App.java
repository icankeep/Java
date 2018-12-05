package com.passer.lifecycle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class App {

	@Autowired
	MyDataSource ds;
	
	@Test
	void testOpenClose() throws Exception {
		ds.doWork();
	}
}
