package com.passer.dao.impl;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.passer.dao.IAccountDAO;

public class AccountDAOImpl implements IAccountDAO{

	private JdbcTemplate jdbcTemplate;
	public void setDataSource (DataSource ds) {
		this.jdbcTemplate = new JdbcTemplate(ds);
	}
	
	public void transIn(Long inId, int money) {
		String sql = "UPDATE account SET balance = balance + ? WHERE id = ?";
		jdbcTemplate.update(sql, money,inId);
	}

	public void transOut(Long outId, int money) {
		String sql = "UPDATE account SET balance = balance - ? WHERE id = ?";
		jdbcTemplate.update(sql, money,outId);
	}
	
}
