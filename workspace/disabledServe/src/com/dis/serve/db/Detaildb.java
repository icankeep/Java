package com.dis.serve.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.dis.serve.po.Commend;
import com.dis.serve.po.Policy;

public class Detaildb {
	static ResultSet rs;
	public static Commend showCom(String name) {
		String sql = "select * from commends where comname='"+name+"'";
		Commend c = new Commend();
		try {
			rs = Mydb.getSmt().executeQuery(sql);
			if(rs.next()) {
				c.setComname(rs.getString(2));
				c.setComcontent(rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return c;
		
	}
	public static Policy showPol(String name) {
		String sql = "select * from policys where polname='"+name+"'";
		Policy p = new Policy();
		try {
			rs = Mydb.getSmt().executeQuery(sql);
			if(rs.next()) {
				p.setPolname(rs.getString(2));
				p.setPolcontent(rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return p;
		
	}

}
