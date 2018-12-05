package com.passer.prepared_statement;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

import com.passer.smis.util.JdbcUtil;

public class PreparedStatementTest {

	@Test
	public void testPreparedStatement1() throws Exception {
		String sql = "INSERT INTO t_student (name,age) VALUES (?,?)";
		Connection conn = JdbcUtil.getConnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, "hhh");
		ps.setInt(2,18);
		ps.executeUpdate();
		JdbcUtil.close(conn,ps,null);
	}
	
	@Test
	public void testPreparedStatement2() throws Exception {
		String sql="SELECT *FROM t_student WHERE name=? AND age=?";
		Connection conn=JdbcUtil.getConnection();
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, "'OR 1 = 1 OR'");
		ps.setInt(2, 40);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		JdbcUtil.close(conn, ps, rs);
	}
	
	@Test
	public void testStatement() throws Exception {
		String name="'OR 1 = 1 OR'";
		String sql="SELECT *FROM t_student WHERE name='"+name+"' AND age=1";
		Connection conn=JdbcUtil.getConnection();
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(sql);
		if(rs.next()) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		JdbcUtil.close(conn, st, rs);
	}
}
