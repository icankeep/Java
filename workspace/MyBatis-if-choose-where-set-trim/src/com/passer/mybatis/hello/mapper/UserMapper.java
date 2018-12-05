package com.passer.mybatis.hello.mapper;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.passer.mybatis.hello.domain.User;

public interface UserMapper {
	
	List <User> getUser(
			@Param("deptid")Long deptid,
			@Param("minSalary")BigDecimal minSalary,
			@Param("maxSalary")BigDecimal maxSalary
	);
}
