package com.dis.serve.db;

import java.sql.ResultSet;
import java.sql.SQLException;


public class Userdb {
	private static ResultSet rs;
	public static void insertUser(String username, String password) {
		String sql = "insert into users(username,password) values('"+username+"','"+password+"')";
		try {
			Mydb.getSmt().executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Boolean findOne(String username, String password, String id) {
		Boolean flag = false;
		String sql = null;
		if(id.equals("1"))
		    sql = "select * from users where username='"+username+"' and password='"+password+"'";
		if(id.equals("2"))
			sql = "select * from admins where username='"+username+"' and password='"+password+"'";	
		try {
			rs = Mydb.getSmt().executeQuery(sql);
			if(rs.next()) {
				flag = true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return flag;		
	}

}
