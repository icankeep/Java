package com.passer.mybatis.hello;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.passer.mybatis.hello.mapper.TeacherMapper;
import com.passer.mybatis.util.MyBatisUtil;

public class App {
	
	
	@Test
	public void testGet() throws Exception {
	
		SqlSession session = MyBatisUtil.getSession();
		TeacherMapper teacherMapper = session.getMapper(TeacherMapper.class);
		teacherMapper.get(1L);
		session.close();
		
		
		System.out.println("-----------------");
		Thread.currentThread().sleep(3000);
		session = MyBatisUtil.getSession();
		teacherMapper = session.getMapper(TeacherMapper.class);
		teacherMapper.get(1L);
		session.close();
	}
}

