package com.passer.smis.template;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.passer.smis.handler.IResultSetHandler;
import com.passer.smis.util.JdbcUtil;

/**
 * Jdbc操作模板类，可以完成DML,DQL操作
 * @author passer
 *
 */
public class JdbcTemplate {
	
	/**
	 * 完成数据库DML操作
	 * @param sql		需要执行的SQL语句
	 * @param params	SQL语句中需要填入的参数集合
	 */
	public static void update(String sql,Object ...params) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = JdbcUtil.getConnection();
			ps = conn.prepareStatement(sql);
			for(int index = 0; index < params.length; index++) {
				ps.setObject(index+1, params[index]);
			}
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(conn, ps, null);
		}
	}
	
	/**
	 * 完成数据库的DQL操作
	 * @param sql		需要执行的SQL语句
	 * @param rsh		处理结果集规范接口
	 * @param params	SQL语句需要填入的参数集合
	 * @return			返回查询的对象或对象集合
	 */
	public static <T> T query(String sql , IResultSetHandler<T> rsh , Object ...params) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = JdbcUtil.getConnection();
			ps = conn.prepareStatement(sql);
			for(int index = 0 ; index < params.length ; index++) {
				ps.setObject(index+1, params[index]);
			}
			return rsh.handle(ps.executeQuery());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(conn, ps, null);
		}
		return null;
		
	}
}
