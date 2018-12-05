package com.passer.dao.impl;

import org.springframework.stereotype.Repository;

import com.passer.dao.IStudentDAO;
import com.passer.domain.Student;

@Repository
public class StudentDAO implements IStudentDAO{

	public void save(Student stu) {
		System.out.println("保存成功");
	}

	public void update(Student stu) {
		int ret = 1 / 0;
		System.out.println("修改成功");
	}

	
}
