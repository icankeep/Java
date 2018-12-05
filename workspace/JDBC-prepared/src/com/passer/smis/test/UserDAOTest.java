package com.passer.smis.test;

import org.junit.Test;

import com.passer.smis.dao.IUserDAO;
import com.passer.smis.dao.impl.UserDAOImpl;
import com.passer.smis.domain.User;

public class UserDAOTest {

	private IUserDAO userDAO = new UserDAOImpl();
	@Test
	public void testSave() {
		User user = new User();
		user.setName("xin");
		user.setAge(13);
		
		userDAO.save(user);
	}

	@Test
	public void testUpdate() {
		User user = new User();
		user.setName("xiugai");
		user.setAge(100);
		userDAO.update(8L, user);
	}

	@Test
	public void testDelete() {
		userDAO.delete(8L);
	}

	@Test
	public void testGet() {
		System.out.println(userDAO.get(6L));
	}

	@Test
	public void testListAll() {
		for (User user : userDAO.listAll()) {
			System.out.println(user);
		}
	}

}
