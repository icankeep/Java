package com.passer.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.TransactionDefinition;

import com.passer.dao.IStudentDAO;
import com.passer.domain.Student;

public class StudentDAO extends JdbcDaoSupport implements IStudentDAO{
	

	
	public void save(Student stu) {
		String sql = "INSERT INTO student (name) VALUES (?)";
		super.getJdbcTemplate().update(sql, stu.getName());
		
	}

	public void update(Student stu) {
		String sql = "UPDATE student SET name = ? WHERE id = ?";
		super.getJdbcTemplate().update(sql, stu.getName(),stu.getId());
	}

	public void delete(Long id) {
		String sql = "DELETE FROM student WHERE id = ?";
		super.getJdbcTemplate().update(sql,id);
	}

	public Student getStudent(Long id) {
		String sql = "SELECT id,name FROM student where id = ?";
		List<Student> list = super.getJdbcTemplate().query(sql, new Object[] {id}, (rs,rowNum)->{
			Student stu = new Student();
			stu.setId(rs.getLong("id"));
			stu.setName(rs.getString("name"));
			return stu;
		});
		return list.size() == 1 ? list.get(0) : null; 
	}

	@Override
	public List<Student> listAllStudent() {
		String sql = "SELECT id,name FROM student";
		return super.getJdbcTemplate().query(sql, new Object[]{}, new RowMapper<Student>() {
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student stu = new Student();
				stu.setId(rs.getLong("id"));
				stu.setName(rs.getString("name"));
				return stu;
			}
		});
	}

	
}
