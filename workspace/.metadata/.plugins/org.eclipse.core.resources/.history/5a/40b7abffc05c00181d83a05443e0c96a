package com.passer.smis.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcTemplate {
	
	/**
	 * DML的操作模板 （增删改）的模板
	 * @param sql	    DML操作的SQL模板（带有占位符？）
	 * @param params	SQL模板中？对应的参数值
	 * @return          受影响的行数
	 */
	public static int update(String sql,Object ... params) {
		Connection conn=null;
		PreparedStatement ps=null;
		try {
			conn=JdbcUtil.getConnection();
			ps=conn.prepareStatement(sql);
			for(int index=0;index<params.length;index++) {
				ps.setObject(index+1,params[index]);
			}
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(conn, ps, null);
		}
		return 0;
	}
	
	/**
	 * DQL操作模板 （查询）模板
	 * @param sql			DQL操作中的SQL模板（带有占位符？）
	 * @param params		SQL模板中？对应的参数值
	 * @return				返回list集合
	 */
	public static <T> T query(String sql,IResultSetHandler<T> rsh,Object ...params) {
		Connection conn=null;
		PreparedStatement ps=null;
		try {
			conn=JdbcUtil.getConnection();
			ps=conn.prepareStatement(sql);
			for(int index=0;index<params.length;index++) {
				ps.setObject(index+1,params[index]);
			}
			return rsh.handler(ps.executeQuery());
		}catch(Exception e) {
		}finally {
			JdbcUtil.close(conn, ps, null);
		}
		return null;
	}
}
