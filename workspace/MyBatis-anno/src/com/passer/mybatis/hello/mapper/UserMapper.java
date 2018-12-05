package com.passer.mybatis.hello.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.passer.mybatis.hello.domain.User;

public interface UserMapper {
	
	@Insert("SELECT *FROM ")
	User getUser2(Map<String,Object> map);
	
	//方式3:使用注解，底层依然是使用map
	User getUser(@Param("name")String name,@Param("password")String password);
	
	void save (User user);
	
	void delete (Long id);
	
	void update (User user);
	
	@Select("SELECT id u_id,name u_name FROM t_user WHERE id = #{id}")
	@Results(id="userMap",value= {
		@Result(column="u_id",property="id"),
		@Result(column="u_name",property="name")
	})
	User get(Long id);
	
	@Select("SELECT id u_id,name u_name FROM t_user")
	@ResultMap("userMap")
	List<User> listAll();
}
