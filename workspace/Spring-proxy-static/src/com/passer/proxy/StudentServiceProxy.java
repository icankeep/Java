package com.passer.proxy;

import org.springframework.beans.factory.annotation.Autowired;

import com.passer.domain.Student;
import com.passer.service.IStudentService;
import com.passer.tx.TransactionManager;

import lombok.Setter;

public class StudentServiceProxy implements IStudentService{

	@Setter
	@Autowired
	private IStudentService target;
	
	@Setter
	@Autowired
	private TransactionManager tx;
	
	public void save(Student stu) {
		tx.begin();
		try {
			target.save(stu);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
		
	}
	
	public void update(Student stu) {
		tx.begin();
		try {
			target.update(stu);
			int ret = 1/0;
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}

	
}
