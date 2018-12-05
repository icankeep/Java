package com.passer.dao.impl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.passer.dao.IAccountDAO;

@Repository
public class AccountDAOImpl implements IAccountDAO{

	private JdbcTemplate jdbcTemplate;
	@Autowired
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
