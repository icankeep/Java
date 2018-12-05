package com.passer.mybatis.hello.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.passer.mybatis.hello.domain.User;

public interface UserMapper {
	
	//方式1：将传入参数封装成一个对象，将对象传入
	
	//方式2:使用map键值对应，key对应参数名，value为参数值
	User getUser2(Map<String,Object> map);
	
	//方式3:使用注解，底层依然是使用map
	User getUser(@Param("name")String name,@Param("password")String password);
	
	void save (User user);
	
	void delete (Long id);
	
	void update (User user);
	
	User get(Long id);
	
	List<User> listAll();
}
