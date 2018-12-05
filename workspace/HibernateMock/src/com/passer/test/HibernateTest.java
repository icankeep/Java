package com.passer.test;

import org.junit.Test;

import com.passer.domain.User;
import com.passer.hibernate.HibernateMock;

public class HibernateTest {

	@Test
	public void testSave() throws Exception {
		HibernateMock.save(new User("hibernate",1));
	}
}
