package com.passer.di_register.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.passer.di_register.dao.IStudentDAO;
import com.passer.di_register.domain.Student;

import lombok.Setter;

@Service
public class StudentService implements IStudentService{

	@Autowired
	private IStudentDAO dao;
	@Override
	public void register(Student student) {
		System.out.println("register...");
		dao.save(student);
	}

}
