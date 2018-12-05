package com.passer.batch;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import com.passer.smis.util.JdbcUtil;

public class BatchTest {

	//5132ms
	@Test
	public void testStatementByBatch() {
		String sql = "INSERT INTO t_user (name,age) VALUES ('abc',15)";
		Connection conn = null;
		Statement st = null;
		Long begin = System.currentTimeMillis();
		try {
			conn = JdbcUtil.getConnection();
			st = conn.createStatement();
			for(int i = 1; i<=1000;i++) {
				st.addBatch(sql);
				if(i % 100 == 0) {
					st.executeBatch();
					st.clearBatch();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(conn, st, null);
		}
		System.out.println(System.currentTimeMillis() - begin);
	}
	
	
	//856ms
	@Test
	public void testPreStatementByBatch() {
		String sql = "INSERT INTO t_user (name,age) VALUES (?,?)";
		Connection conn = null;
		PreparedStatement ps =null;
		conn = JdbcUtil.getConnection();
		Long begin = System.currentTimeMillis();
		try {
			ps = conn.prepareStatement(sql);
			for (int i = 1; i <= 1000; i++) {
				ps.setString(1, "name");
				ps.setInt(2, i);
				ps.addBatch();
				if(i % 100 == 0) {
					ps.executeBatch();
					ps.clearBatch();
					ps.clearParameters();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(conn, ps, null);
		}
		System.out.println(System.currentTimeMillis() - begin);
	}
}
