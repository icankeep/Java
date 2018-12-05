package com.passer.smis.dao.impl;

import com.passer.smis.dao.IUserDAO;
import com.passer.smis.domain.User;
import com.passer.smis.handler.impl.BeanHandler;
import com.passer.smis.template.JdbcTemplate;

public class UserDAOImpl implements IUserDAO{

	public User getUser(Long id) {
		String sql = "SELECT * FROM user WHERE id = ?";
		return JdbcTemplate.query(sql, new BeanHandler<>(User.class), id);
	}

	public String getPasswordByUsername(String username) {
		String sql = "SELECT * FROM user where username = ?";
		return JdbcTemplate.query(sql, new BeanHandler<>(User.class), username).getPassword();
	}


}
