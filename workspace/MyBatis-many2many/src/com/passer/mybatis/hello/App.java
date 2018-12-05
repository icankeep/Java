package com.passer.mybatis.hello;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.passer.mybatis.hello.domain.Student;
import com.passer.mybatis.hello.domain.Teacher;
import com.passer.mybatis.hello.mapper.StudentMapper;
import com.passer.mybatis.hello.mapper.TeacherMapper;
import com.passer.mybatis.util.MyBatisUtil;

public class App {
	
	@Test
	public void testSave() throws Exception {
		
		Teacher t1 = new Teacher();
		Teacher t2 = new Teacher();
		t1.setName("t1");
		t2.setName("t2");
		
		Student s1 = new Student();
		Student s2 = new Student();
		s1.setName("s1");
		s2.setName("s2");
		s1.getTeachers().add(t1);
		s1.getTeachers().add(t2);
		s2.getTeachers().add(t1);
		s2.getTeachers().add(t2);
		
		//维护关系
		
		SqlSession session = MyBatisUtil.getSession();
		StudentMapper stuMapper = session.getMapper(StudentMapper.class);
		TeacherMapper teacherMapper = session.getMapper(TeacherMapper.class);
		
		teacherMapper.save(t1);
		teacherMapper.save(t2);

		stuMapper.save(s1);
		stuMapper.save(s2);
		
		stuMapper.insertRelationWithTeacher(s1.getId(),t1.getId());
		stuMapper.insertRelationWithTeacher(s2.getId(), t1.getId());
		stuMapper.insertRelationWithTeacher(s1.getId(),t2.getId());
		stuMapper.insertRelationWithTeacher(s2.getId(), t2.getId());
		session.commit();
	}
	
	@Test
	public void testDelete() throws Exception {
		SqlSession session = MyBatisUtil.getSession();
		StudentMapper stuMapper = session.getMapper(StudentMapper.class);
		
		stuMapper.deleteRelationWithTeacher(1L);
		stuMapper.delete(1L);
		
		session.commit();
	}
	
	@Test
	public void testGet() throws Exception {
		StudentMapper stuMapper = MyBatisUtil.getMapper(StudentMapper.class);
		Student s = stuMapper.get(1L);
		System.out.println(s);
		//System.out.println(s.getTeachers());
	}
}

