package com.passer.mybatis.hello.mapper;

import com.passer.mybatis.hello.domain.Department;

public interface DepartmentMapper {

	void save(Department d);

	Department get(Long id);
}
