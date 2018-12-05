package com.passer.di_register.service;

import com.passer.di_register.dao.IStudentDAO;
import com.passer.di_register.domain.Student;

import lombok.Setter;

public class StudentService implements IStudentService{

	@Setter
	private IStudentDAO dao;
	@Override
	public void register(Student student) {
		System.out.println("register...");
		dao.save(student);
	}

}
