package com.passer.dao;

import java.util.List;

import com.passer.domain.Student;

public interface IStudentDAO {

	void save(Student stu);
	
	void update(Student stu);
	
	void delete(Long id);
	
	Student getStudent(Long id);
	
	List <Student> listAllStudent();
	
}
