package com.mydata.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.AbstractList;
import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import com.test.model.stuInfo;

public class stuInfoService {
	private Connection conn;
	private PreparedStatement pstmt;
	public stuInfoService() {
		conn = new com.mydata.conn.conn().getCon();

	}
	public boolean addStu(stuInfo stu)
	{
		try{
		 	pstmt=conn.prepareStatement("insert into studentinfo"
					+"(id,name,sex,birth,course)"
					+"values(?,?,?,?,?)");
			pstmt.setLong(1,stu.getId());
			pstmt.setString(2,stu.getName());
			pstmt.setInt(3,stu.getSex());
			pstmt.setString(4,stu.getBirth());
			pstmt.setString(5,stu.getCourses());
			pstmt.executeUpdate();
			return true;
			
		
		}catch(SQLException e){
			e.printStackTrace();
			return false;
		}
		
		
	}
	public List queryAllStu()
	{
		List stus=(List) new ArrayList();
		try{
			pstmt=conn.prepareStatement("select * from studentinfo");
			ResultSet rs=(ResultSet) pstmt.executeQuery();
			while (rs.next())
			{
				stuInfo stu=new stuInfo();
				stu.setId(rs.getLong(1));
				stu.setName(rs.getString(2));
				stu.setSex(rs.getInt(3));
				if (rs.getDate(4)!=null)
					stu.setBirth(rs.getDate(4).toString());
				if (rs.getString(5)!=null)
					stu.setCourse(rs.getString(5).split("&"));
				    ((AbstractList) stus).add(stu);
				    return stus;
			}
			return null;
		} catch(SQLException e){
			e.printStackTrace();
		return null;
		}
	
		
	}
}
