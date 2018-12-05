package com.passer.return_pk;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

import com.passer.smis.util.JdbcUtil;

public class ReturnPkTest {
	@Test
	public void testStatement() throws Exception {
		String sql="INSERT INTO t_student (name,age) VALUES ('passer',15)";
		Connection conn=JdbcUtil.getConnection();
		Statement st=conn.createStatement();
		//设置可以获取自动生成的主键
		st.executeUpdate(sql,Statement.RETURN_GENERATED_KEYS);
		//获取自动生成的主键
		ResultSet rs=st.getGeneratedKeys();
		while(rs.next()) {
			System.out.println(rs.getLong(1));
		}
		JdbcUtil.close(conn,st,rs);
	}
	
	@Test
	public void testPreparedStatement() throws Exception {
		String sql="INSERT INTO t_student (name,age) VALUES (?,?)";
		Connection conn=JdbcUtil.getConnection();
		//设置可以获取自动生成的主键
		PreparedStatement ps=conn.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
		ps.setString(1, "passer");
		ps.setInt(2, 13);
		ps.executeUpdate();
		//获取自动生成的主键
		ResultSet rs=ps.getGeneratedKeys();
		while(rs.next()) {
			System.out.println(rs.getLong(1));
		}
		JdbcUtil.close(conn,ps,rs);
	}
}