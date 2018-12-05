package com.passer.smis.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.passer.smis.dao.IUserDAO;
import com.passer.smis.domain.User;
import com.passer.smis.util.JdbcUtil;

public class UserDAOImpl implements IUserDAO{

	public void save(User user) {
		StringBuilder sql = new StringBuilder(80);
		sql.append("INSERT INTO t_user(name,age) VALUES ('");
		sql.append(user.getName());
		sql.append("',");
		sql.append(user.getAge());
		sql.append(")");
		
		Connection conn = null;
		Statement st = null;
		try {
			//加载注册驱动
			//获取连接对象
			conn = JdbcUtil.getConnection();
			//创建语句对象
			st = conn.createStatement();
			//执行sql语句
			st.execute(sql.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(conn, st, null);
		}
		
	}

	public void update(Long id, User newUser) {
		StringBuilder sql = new StringBuilder(80);
		sql.append("UPDATE t_user SET name = '");
		sql.append(newUser.getName());
		sql.append("',age = ");
		sql.append(newUser.getAge());
		sql.append(" WHERE id = ");
		sql.append(id);
		
		Connection conn = null;
		Statement st = null;
		try {
			conn = JdbcUtil.getConnection();
			st = conn.createStatement();
			st.execute(sql.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(conn, st, null);
		}
		
	}

	public void delete(Long id) {
		
		StringBuilder sql = new StringBuilder(80);
		sql.append("DELETE FROM t_user WHERE id = ");
		sql.append(id);
		
		Connection conn = null;
		Statement st = null;
		try {
			conn = JdbcUtil.getConnection();
			st = conn.createStatement();
			st.execute(sql.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(conn, st, null);
		}
		
	}

	public User get(Long id) {
		User user = new User();
		StringBuilder sql = new StringBuilder(80);
		sql.append("SELECT * FROM t_user WHERE id = ");
		sql.append(id);
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = JdbcUtil.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery(sql.toString());
			if(rs.next()) {
				user.setId(rs.getLong("id"));
				user.setName(rs.getString("name"));
				user.setAge(rs.getInt("age"));
				return user;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(conn, st, rs);
		}
		return null;
	}

	public List<User> listAll() {
		List <User> list = new ArrayList<>();
		String sql = "SELECT * FROM t_user";
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = JdbcUtil.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				User user = new User();
				user.setId(rs.getLong("id"));
				user.setName(rs.getString("name"));
				user.setAge(rs.getInt("age"));
				list.add(user);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(conn, st, rs);
		}
		return null;
	}
	
}
