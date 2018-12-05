package com.passer.commit;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.passer.smis.util.JdbcUtil;

public class TxTest {
	@Test
	public void test1() throws Exception {
		String sql="SELECT * FROM t_student WHERE name=? AND salary >=?";
		Connection conn=JdbcUtil.getConnection();
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, "passer");
		ps.setBigDecimal(2, new BigDecimal(199.0));
		ResultSet rs=ps.executeQuery();
		if(!rs.next()) {
			throw new RuntimeException("余额不足");
		}
		sql="UPDATE t_student SET salary=salary-? WHERE name=?";
		ps=conn.prepareStatement(sql);
		ps.setBigDecimal(1,new BigDecimal(199.0));
		ps.setString(2, "passer");
		ps.executeUpdate();
		sql="UPDATE t_student SET salary=salary+? WHERE name=?";
		ps=conn.prepareStatement(sql);
		ps.setBigDecimal(1, new BigDecimal(199.0));
		ps.setString(2, "lll");
		ps.executeUpdate();
		JdbcUtil.close(conn, ps, rs);
	}
	
	@Test
	public void test2()  {
		String sql="SELECT * FROM t_student WHERE name=? AND salary >=?";
		Connection conn=JdbcUtil.getConnection();
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			conn.setAutoCommit(false);	//取消自动提交
			ps=conn.prepareStatement(sql);
			ps.setString(1, "passer");
			ps.setBigDecimal(2, new BigDecimal(199.0));
			rs=ps.executeQuery();
			if(!rs.next()) {
				throw new RuntimeException("余额不足");
			}
			sql="UPDATE t_student SET salary=salary-? WHERE name=?";
			ps=conn.prepareStatement(sql);
			ps.setBigDecimal(1,new BigDecimal(199.0));
			ps.setString(2, "passer");
			ps.executeUpdate();
			sql="UPDATE t_student SET salary=salary+? WHERE name=?";
			ps=conn.prepareStatement(sql);
			ps.setBigDecimal(1, new BigDecimal(199.0));
			ps.setString(2, "lll");
			ps.executeUpdate();
			conn.commit();	//提交事务
		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}   //回滚
		} finally {
			JdbcUtil.close(conn, ps, rs);
		}
		
	}
}
