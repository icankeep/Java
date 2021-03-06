package com.passer.smis.dao;

import java.util.List;

import com.passer.smis.domain.Student;

public interface IStudentDAO {
	/**
	 * 保存操作
	 * @param stu 要保存的学生对象
	 */
	void save(Student stu);
	
	/**
	 * 修改对应id的学生信息
	 * @param newStu  	新的学生对象
	 */
	void update(Student newStu);
	
	/**
	 * 删除操作
	 * @param id	要删除的学生id
	 */
	void delete(Long id);
	
	/**
	 * 获取对应id的学生信息
	 * @param id	要获取信息的学生id
	 * @return		返回该学生对象
	 */
	Student get(Long id);
	
	/**
	 * 获取所有学生的信息
	 * @return	返回所有的学生对象List集合
	 */
	List<Student> listAll();
}
