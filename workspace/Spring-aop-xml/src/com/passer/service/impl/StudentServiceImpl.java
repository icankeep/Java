package com.passer.service.impl;

import com.passer.dao.IStudentDAO;
import com.passer.domain.Student;
import com.passer.service.IStudentService;

import lombok.Setter;

public class StudentServiceImpl implements IStudentService{

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
