package com.passer.di_datasource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import lombok.Cleanup;

@SpringJUnitConfig
public class App {

	@Autowired
	private DataSource dataSource;
	@Test
	void testDataSource() throws Exception {
		
		@Cleanup
		Connection conn = dataSource.getConnection();
		@Cleanup
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM student");
		@Cleanup
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getLong("id")+","+rs.getString("name"));
		}
	}
	
}
