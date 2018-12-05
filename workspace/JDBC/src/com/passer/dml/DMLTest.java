package com.passer.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.junit.Test;

public class DMLTest {
	@Test
	public void testInsert() throws Exception {
		String sql="INSERT INTO t_student(name,age) VALUES('乔峰','30')";
		//加载注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//创建连接对象
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_database?characterEncoding=utf-8", "root", "admin");
		//创建语句对象
		Statement st=conn.createStatement();
		//执行sql语句
		st.executeUpdate(sql);
		st.close();
		conn.close();
	}
	@Test
	public void testUpdate() throws Exception {
		String sql="UPDATE t_student set name='西门吹雪' WHERE id=2";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_database?characterEncoding=utf-8", "root", "admin");
		Statement st=conn.createStatement();
		st.executeUpdate(sql);
		st.close();
		conn.close();
	}
	@Test
	public void testDelete() throws Exception {
		String sql="DELETE FROM t_student WHERE id=1";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_database?characterEncoding=utf-8", "root", "admin");
		Statement st=conn.createStatement();
		st.executeUpdate(sql);
		st.close();
		conn.close();
	}
}
