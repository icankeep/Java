package com.passer.mybatis.hello.mapper;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.passer.mybatis.hello.domain.User;
import com.passer.mybatis.hello.query.UserObjectQuery;

public interface UserMapper {
	
	//高级查询
	List <User> query(UserObjectQuery qo);
	
	//查询结果总数
	Integer queryForCount(UserObjectQuery qo);
	
	List<User> getUser(@Param("minSalary")BigDecimal minSalary);
}
