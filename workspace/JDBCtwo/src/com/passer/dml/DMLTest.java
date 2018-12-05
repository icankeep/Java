package com.passer.dml;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.junit.Test;

public class DMLTest {

	//用JDBC向数据库新增一位用户信息
	@Test
	public void testInsert() throws Exception {
		String sql = "INSERT INTO t_user (id,name,age) VALUES (1,'周',15)";
		//加载注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//获取连接对象
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_user?characterEncoding=utf-8", "root", "admin");
		//创建语句对象
		Statement st = conn.createStatement();
		//执行语句对象
		st.execute(sql);
		st.close();
		conn.close();
	}
	
	//用JDBC向数据库修改id=1的用户信息
	@Test
	public void testUpdate() throws Exception {
		String sql = "UPDATE t_user SET name = '周',age = 12 WHERE id = 1";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql:///db_user?characterEncoding=utf-8", "root", "admin");
		Statement st = conn.createStatement();
		st.execute(sql);
		st.close();
		conn.close();
	}
	
	//删除
	@Test
	public void testDelete() throws Exception {
		String sql = "DELETE FROM t_user WHERE id = 1";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql:///db_user?characterEncoding=utf-8", "root", "admin");
		Statement st = conn.createStatement();
		st.execute(sql);
		st.close();
		conn.close();
	}
}
