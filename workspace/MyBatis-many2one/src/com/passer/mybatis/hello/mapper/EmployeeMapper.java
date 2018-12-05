package com.passer.mybatis.hello.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.passer.mybatis.hello.domain.Employee;

public interface EmployeeMapper {

	void save(Employee e);
	
	Employee get(@Param("id")Long id);

	List<Employee> listAll();
}
