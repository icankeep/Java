package com.passer.dao.impl;

import com.passer.dao.IStudentDAO;
import com.passer.domain.Student;

public class StudentDAO implements IStudentDAO{

	public void save(Student stu) {
		System.out.println("保存学生信息");
	}

	public void update(Student stu) {
		System.out.println("修改学生信息");
	}

	
}
