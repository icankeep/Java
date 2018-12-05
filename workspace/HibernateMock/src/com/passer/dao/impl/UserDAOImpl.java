package com.passer.dao.impl;

import java.util.List;

import com.passer.dao.IUserDAO;
import com.passer.domain.User;
import com.passer.handle.BeanHandler;
import com.passer.handle.BeanListHandler;
import com.passer.util.JdbcTemplate;

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
