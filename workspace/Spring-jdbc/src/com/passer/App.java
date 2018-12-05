package com.passer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.passer.dao.IStudentDAO;
import com.passer.domain.Student;

@SpringJUnitConfig
public class App {
	
	@Autowired
	private IStudentDAO studentDAO;
	@Test
	void testSave() throws Exception {
		Student stu = new Student();
		stu.setName("李四");
		studentDAO.save(stu);
	}
	
	@Test
	void testUpdate() throws Exception {
		Student stu = new Student();
		stu.setId(1L);
		stu.setName("lalala");
		studentDAO.update(stu);
	}
	
	@Test
	void testDelete() throws Exception {
		studentDAO.delete(1L);
	}
	
	@Test
	void testGet() throws Exception {
		System.out.println(studentDAO.getStudent(2L));
	}
	
	@Test
	void testListAll() throws Exception {
		for (Student stu : studentDAO.listAllStudent()) {
			System.out.println(stu);
		}
	}
}
