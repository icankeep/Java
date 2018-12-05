package com.passer.druid;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.Test;

public class DruidTest {
	
	@Test
	public void testDruid() throws Exception {
		String sql="INSERT INTO t_student (name,age) VALUES ('passer',15)";
		Connection conn=DruidUtil.getConnection();
		Statement st=conn.createStatement();
		st.executeUpdate(sql,Statement.RETURN_GENERATED_KEYS);
		ResultSet rs=st.getGeneratedKeys();
		while(rs.next()) {
			System.out.println(rs.getLong(1));
		}
		DruidUtil.close(conn,st,rs);
	}
}
