package com.passer.service;

import com.passer.dao.IStudentDAO;
import com.passer.domain.Student;

import lombok.Setter;

public class StudentService{

	@Setter
	private IStudentDAO studentDAO;
	
	public void save(Student stu) {
		System.out.println("保存学生信息");
		studentDAO.save(stu);
	}

	public void update(Student stu) {
		System.out.println("修改学生信息");
		studentDAO.update(stu);
	}

}
