package com.passer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.passer.dao.IStudentDAO;
import com.passer.domain.Student;
import com.passer.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService{

	@Autowired
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
