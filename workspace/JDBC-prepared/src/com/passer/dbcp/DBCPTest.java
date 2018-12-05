package com.passer.dbcp;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.Test;

import com.passer.smis.util.JdbcUtil;

public class DBCPTest {
	
	/*public static DataSource getDataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql:///db_user");
		ds.setUsername("root");
		ds.setPassword("admin");
		return ds;
	}
	@Test
	public void testDBCP() {
		String sql = "INSERT INTO t_user (name,age) VALUES('z',13)";
		Connection conn = null;
		Statement st = null;
		try {
			conn = getDataSource().getConnection();
			st = conn.createStatement();
			st.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(conn, st, null);
		}
		
	}*/
	
	
	@Test
	public void testConnByUtil() throws Exception {
		String sql = "INSERT INTO t_user (name,age) VALUES('z',13)";
		Connection conn = null;
		Statement st = null;
		try {
			conn = DBCPUtil.getConnection();
			st = conn.createStatement();
			st.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBCPUtil.close(conn, st, null);
		}
	}
}
