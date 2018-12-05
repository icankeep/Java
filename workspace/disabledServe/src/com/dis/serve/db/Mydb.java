package com.dis.serve.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Mydb {
    private static Connection conn;
	private static  Statement smt;
	private final static String url = "jdbc:mysql://localhost:3306/disable?useUnicode=true&characterEncoding=UTF-8";
	private final static String user = "root";
	private final static String password = "admin";
	public static Connection getConn() {
		return conn;
	}
	public static void setConn(Connection conn) {
		Mydb.conn = conn;
	}
	
	public static Statement getSmt() {
		return smt;
	}
	public static void setSmt(Statement smt) {
		Mydb.smt = smt;
	}
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			smt = conn.createStatement();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
