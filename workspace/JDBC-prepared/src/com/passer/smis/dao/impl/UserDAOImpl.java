package com.passer.smis.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.passer.smis.dao.IUserDAO;
import com.passer.smis.domain.User;
import com.passer.smis.util.JdbcUtil;

public class UserDAOImpl implements IUserDAO{

	public void save(User user) {
		String sql = "INSERT INTO t_user (name,age) VALUES(?,?)";
		Connection conn = null;
		PreparedStatement ps = null;
		conn = JdbcUtil.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, user.getName());
			ps.setInt(2, user.getAge());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(conn, ps, null);
		}
	}

	public void update(Long id, User newUser) {
		String sql = "UPDATE t_user SET name = ?,age = ? WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = JdbcUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, newUser.getName());
			ps.setInt(2, newUser.getAge());
			ps.setLong(3, id);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(conn, ps, null);
		}
		
	}

	public void delete(Long id) {
		
		String sql = "DELETE FROM t_user WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = JdbcUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setLong(1, id);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(conn, ps, null);
		}
		
	}

	public User get(Long id) {
		User user = new User();
		String sql = "SELECT * FROM t_user WHERE id = ?";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = JdbcUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setLong(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
				user.setId(rs.getLong("id"));
				user.setName(rs.getString("name"));
				user.setAge(rs.getInt("age"));
				return user;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(conn, ps, rs);
		}
		return null;
	}

	public List<User> listAll() {
		List <User> list = new ArrayList<>();
		String sql = "SELECT * FROM t_user";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = JdbcUtil.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
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
			JdbcUtil.close(conn, ps, rs);
		}
		return null;
	}
	
}
