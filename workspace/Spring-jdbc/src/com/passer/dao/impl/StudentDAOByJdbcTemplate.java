package com.passer.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.passer.dao.IStudentDAO;
import com.passer.domain.Student;

public class StudentDAOByJdbcTemplate implements IStudentDAO{
	
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource ds) {
		this.jdbcTemplate = new JdbcTemplate(ds);
	}

	public void save(Student stu) {
		String sql = "INSERT INTO student (name) VALUES (?)";
		jdbcTemplate.update(sql, stu.getName());
	}

	public void update(Student stu) {
		String sql = "UPDATE student SET name = ? WHERE id = ?";
		jdbcTemplate.update(sql, stu.getName(),stu.getId());
	}

	public void delete(Long id) {
		String sql = "DELETE FROM student WHERE id = ?";
		jdbcTemplate.update(sql,id);
	}

	public Student getStudent(Long id) {
		String sql = "SELECT id,name FROM student where id = ?";
		List<Student> list = jdbcTemplate.query(sql, new Object[] {id}, (rs,rowNum)->{
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
		return jdbcTemplate.query(sql, new Object[]{}, new RowMapper<Student>() {
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student stu = new Student();
				stu.setId(rs.getLong("id"));
				stu.setName(rs.getString("name"));
				return stu;
			}
		});
	}

	
}
