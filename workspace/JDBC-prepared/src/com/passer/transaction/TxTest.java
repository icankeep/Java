package com.passer.transaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import com.passer.smis.util.JdbcUtil;

public class TxTest {

	@Test
	public void testStatementTx(){
		String sql = "UPDATE t_user SET age = age + 10 WHERE id = 2";
		Connection conn = null;
		Statement st = null;
		try {
			conn = JdbcUtil.getConnection();
			//conn.setAutoCommit(false);
			st = conn.createStatement();
			st.executeUpdate(sql);
			sql = "UPDATE  t_user SET age = age - 10 WHERE id = 3";
			int a = 1/0;
			st.executeUpdate(sql);
			//conn.commit();
		} catch (Exception e) {
			try {
				//conn.rollback();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			JdbcUtil.close(conn, st, null);
		}
	}
	
	@Test
	public void testPreparedStTx(){
		String sql = "UPDATE t_user SET age = age + ? WHERE id = ?";
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = JdbcUtil.getConnection();
			conn.setAutoCommit(false);
			ps = conn.prepareStatement(sql);
			ps.setInt(1, 10);
			ps.setLong(2, 2L);
			ps.executeUpdate();
			int a = 1/0;
			sql = "UPDATE t_user SET age = age - ? WHERE id = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, 10);
			ps.setLong(2, 3L);
			ps.executeUpdate();
			conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}finally {
			JdbcUtil.close(conn, ps, null);
		}
	}
	
}

