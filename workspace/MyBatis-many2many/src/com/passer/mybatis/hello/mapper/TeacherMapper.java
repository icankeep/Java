package com.passer.mybatis.hello.mapper;

import com.passer.mybatis.hello.domain.Teacher;

public interface TeacherMapper {

	void save(Teacher t);
	
	void delete(Long id);
	
	Teacher get(Long id);
}
