package com.passer.mybatis.hello;

import java.math.BigDecimal;
import java.util.List;

import com.passer.mybatis.hello.domain.User;
import com.passer.mybatis.hello.mapper.UserMapper;
import com.passer.mybatis.util.MyBatisUtil;

public class App {
	@org.junit.Test
	public void testGetUser() throws Exception {
		UserMapper mapper = MyBatisUtil.getMapper(UserMapper.class);
		List <User> users = mapper.getUser(10L,null, new BigDecimal("10000"));
		for (User user : users) {
			System.out.println(user);
		}
	}
	
}
