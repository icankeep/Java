package com.passer.di_register.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.passer.di_register.domain.Student;
import com.passer.di_register.service.IStudentService;

import lombok.Setter;

@Controller
public class StudentAction {

	@Autowired
	private IStudentService service;
	
	public void execute() {
		Student student = new Student();
		student.setName("李四");
		System.out.println("register request...");
		service.register(student);
	}
}
