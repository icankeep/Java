package com.passer.mybatis.hello.mapper;

import org.apache.ibatis.annotations.Param;

import com.passer.mybatis.hello.domain.Student;

public interface StudentMapper {
	void save(Student s);
	
	void delete(Long id);
	
	void deleteRelationWithTeacher(Long id);
	
	Student get(Long id);

	void insertRelationWithTeacher(@Param("studentId")Long studentId, @Param("teacherId")Long teacherId);
}
