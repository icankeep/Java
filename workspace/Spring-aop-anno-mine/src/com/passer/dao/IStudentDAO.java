package com.passer.dao;

import com.passer.domain.Student;

public interface IStudentDAO {

	void save(Student stu);
	
	void update(Student stu);
}
