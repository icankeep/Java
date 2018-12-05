package cn.wolfcode.mybatis.hello;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import cn.wolfcode.mybatis.util.MyBatisUtil;

public class App {

	
	//查询ID为1的用户信息
	@Test
	void testGet() throws Exception {
		SqlSession session = MyBatisUtil.getSession();
		//具体的操作(增删改查)
		User u = session.selectOne("cn.wolfcode.mybatis.hello.UserMapper.get");
		session.close();
		System.out.println(u);
	}

	//查询所有的用户信息
	@Test
	void testListAll() throws Exception {
		SqlSession session = MyBatisUtil.getSession();
		//具体的操作(增删改查)
		List<User> us = session.selectList("cn.wolfcode.mybatis.hello.UserMapper.listAll");
		session.close();
		for (User u : us) {
			System.out.println(u);
		}
	}

}
