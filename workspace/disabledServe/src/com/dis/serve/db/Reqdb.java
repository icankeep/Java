package com.dis.serve.db;

import java.sql.SQLException;

import com.dis.serve.po.RequestSub;

public class Reqdb {
	public static void insertReq(RequestSub r) {
		String sql = "insert into requests(username,mobile,sex,kind,content) values("
	      + "'"+r.getUsername()+"','"+r.getMobile()+"','"+r.getSex()+"','"+r.getKind()+"','"+r.getContent()+"')";
		try {
			Mydb.getSmt().executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
        
}
