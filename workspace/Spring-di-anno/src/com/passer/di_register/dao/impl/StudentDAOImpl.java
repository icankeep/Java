package com.passer.di_register.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.passer.di_register.dao.IStudentDAO;
import com.passer.di_register.domain.Student;

import lombok.Cleanup;
import lombok.Setter;
import lombok.SneakyThrows;

@Repository
public class StudentDAOImpl implements IStudentDAO{

	@Autowired
	private DataSource dataSource;
	
	@SneakyThrows
	public void save(Student student) {
		System.out.println("dao...");
		@Cleanup
		Connection conn = dataSource.getConnection();
		@Cleanup
		PreparedStatement ps = conn.prepareStatement("INSERT INTO student (name) VALUES (?)");
		ps.setString(1,student.getName());
		ps.executeUpdate();
	}
	
}
