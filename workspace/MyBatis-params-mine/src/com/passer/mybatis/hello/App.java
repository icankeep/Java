package com.passer.mybatis.hello;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import com.passer.mybatis.hello.domain.User;
import com.passer.mybatis.hello.mapper.UserMapper;
import com.passer.mybatis.util.MyBatisUtil;

public class App {
	
	@org.junit.Test
	public void testGetUserByMap() throws Exception {
		SqlSession session = MyBatisUtil.getSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		User user = mapper.getUser2(new HashMap<String,Object>(){
			{
				this.put("name", "passer");
				this.put("password", "123456");
			}
		});
		System.out.println(user);
		session.close();
	}

	@Test
	void testGetUser() throws Exception {
		SqlSession session = MyBatisUtil.getSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		User user = mapper.getUser("passer", "123456");
		System.out.println(user);
		session.close();
	}
	@Test
	void testListAll() throws Exception {
		SqlSession session = MyBatisUtil.getSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		List<User> users = mapper.listAll();
		for (User user : users) {
			System.out.println(user);
		}
		session.close();
	}
	
}
