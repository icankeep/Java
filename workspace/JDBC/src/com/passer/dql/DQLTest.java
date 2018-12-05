package com.passer.dql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

public class DQLTest {
	@Test
	public void testDQL() throws Exception {
		String sql="SELECT name n FROM t_student";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_database?characterEncoding=utf-8", "root", "admin");
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString("n"));			
		}
		st.close();
		conn.close();
		rs.close();
	}
	
	/*
	 *1.需求：查询t_student中一共有多少条学生信息
	 */
	@Test
	public void testDQL2() throws Exception {
		String sql="SELECT COUNT(id) FROM t_student";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_database?characterEncoding=utf-8","root", "admin");
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(sql);
		if(rs.next()) {
			System.out.println(rs.getLong(1)); //这里需要用Long接收,容易出错
		}
		conn.close();
		st.close();
		rs.close();
	}
	
	/*
	 * 2.需求：查询t_student表中id=2的学生信息
	 */
	@Test
	public void testDQL3() throws Exception {
		String sql="SELECT *FROM t_student WHERE id=2";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_database?characterEncoding=utf-8", "root", "admin");
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getInt("id")+rs.getString("name")+rs.getInt("age"));
		}
		conn.close();
		st.close();
		rs.close();
	}
	/*
	 * 3.需求：查询t_student表中所有学生的信息
	 */
	@Test
	public void testDQL4() throws Exception {
		String sql="SELECT * FROM t_student";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_database?characterEncoding=utf-8","root", "admin");
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(sql);
		System.out.println("---------------");
		System.out.println("id name     age");
		//处理结果集
		while(rs.next()) {
			System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getInt("age"));
		}
		System.out.println("---------------");
	}
}
