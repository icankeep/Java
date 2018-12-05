package com.passer.smis.dao.impl;

import java.util.List;

import com.passer.smis.dao.IUserDAO;
import com.passer.smis.domain.User;
import com.passer.smis.handle.BeanHandler;
import com.passer.smis.handle.BeanListHandler;
import com.passer.smis.util.JdbcTemplate;

public class UserDAOImpl implements IUserDAO{

	public void save(User user) {
		String sql = "INSERT INTO t_user (name,age) VALUES(?,?)";
		JdbcTemplate.update(sql, user.getName(),user.getAge());
	}

	public void update(Long id, User newUser) {
		String sql = "UPDATE t_user SET name = ?,age = ? WHERE id = ?";
		JdbcTemplate.update(sql, newUser.getName(),newUser.getAge(),id);
	}

	public void delete(Long id) {
		String sql = "DELETE FROM t_user WHERE id = ?";
		JdbcTemplate.update(sql, id);
	}

	public User get(Long id) {
		String sql = "SELECT * FROM t_user WHERE id = ?";
		return JdbcTemplate.query(sql,new BeanHandler<>(User.class), id);
	}

	public List<User> listAll() {
		String sql = "SELECT * FROM t_user";
		return JdbcTemplate.query(sql,new BeanListHandler<>(User.class));
	}
	
}
