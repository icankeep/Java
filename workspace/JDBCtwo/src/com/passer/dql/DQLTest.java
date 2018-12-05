package com.passer.dql;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

public class DQLTest {

	
	//查询用户信息条数
	@Test
	public void testCount() throws Exception {
		String sql = "SELECT COUNT(id) FROM t_user";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql:///db_user?characterEncoding=utf-8", "root", "admin");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getLong("COUNT(id)"));
		}
		rs.close();
		st.close();
		conn.close();
	}
	
	//查询所有用户信息
	@Test
	public void testQueryAll() throws Exception {
		String sql = "SELECT * FROM t_user";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql:///db_user?characterEncoding=utf-8", "root", "admin");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			System.out.println("id:"+rs.getLong("id")+"  name:"+rs.getString("name")+"   age:"+rs.getInt("age"));
		}
		rs.close();
		st.close();
		conn.close();
	}
}
