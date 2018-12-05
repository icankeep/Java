package com.passer.connection;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class ConnectionTest {
	@Test
	public void testConnection1() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/user_database";
		//String url="jdbc:mysql:///user_database";
		String user="root";
		String password="admin";
		Connection conn=DriverManager.getConnection(url, user, password);
		Thread.sleep(10000);
	}
	
	@Test
	public void testConnection2() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/user_database";
		String user="root";
		String password="admin";
		Connection conn=DriverManager.getConnection(url,user,password);
	}
}
