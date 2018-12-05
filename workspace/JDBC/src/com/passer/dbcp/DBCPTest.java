package com.passer.dbcp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.Test;

public class DBCPTest {
	@Test
	public void testDBCP() throws Exception {
		String sql="INSERT INTO t_student (name,age) VALUES ('passer',15)";
		DataSource ds=getDataSource();
		Connection conn=ds.getConnection();
		Statement st=conn.createStatement();
		st.executeUpdate(sql,Statement.RETURN_GENERATED_KEYS);
		ResultSet rs=st.getGeneratedKeys();
		while(rs.next()) {
			System.out.println(rs.getLong(1));
		}
	}

	public DataSource getDataSource() {
		BasicDataSource ds=new BasicDataSource();
		ds.setUrl("jdbc:mysql://localhost:3306/user_database");
		ds.setUsername("root");
		ds.setPassword("admin");
		return ds;
	}
	
	@Test
	public void testDBCP2() throws Exception {
		String sql="INSERT INTO t_student (name,age) VALUES ('passer',15)";
		Connection conn=DBCPUtil.getConnection();
		Statement st=conn.createStatement();
		st.executeUpdate(sql,Statement.RETURN_GENERATED_KEYS);
		ResultSet rs=st.getGeneratedKeys();
		while(rs.next()) {
			System.out.println(rs.getLong(1));
		}
		DBCPUtil.close(conn,st,rs);
	}
}
