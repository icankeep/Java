package com.passer.di_register.action;

import com.passer.di_register.domain.Student;
import com.passer.di_register.service.IStudentService;

import lombok.Setter;

public class StudentAction {

	@Setter
	private IStudentService service;
	
	public void execute() {
		Student student = new Student();
		student.setName("李四");
		System.out.println("register request...");
		service.register(student);
	}
}
