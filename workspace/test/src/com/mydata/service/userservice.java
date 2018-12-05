package com.mydata.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.resource.cci.ResultSet;

import com.test.model.userTable;

public class userservice {
	private Connection conn;
private PreparedStatement pstmt;
	public userservice() {
		conn = new com.mydata.conn.conn().getCon();

	}
	public boolean valiUser(userTable user)
	{
		try{
			pstmt=conn.prepareStatement("select * from usertable where username=? and password=?");
			pstmt.setString(1,user.getUsername());
			pstmt.setString(1,user.getPassword());
			ResultSet rs=(ResultSet) pstmt.executeQuery();
			if(rs.next())
				return true;
			else
				return false;
			
		
		}catch(SQLException e){
			e.printStackTrace();
			return false;
		}
		
		
	}
}
