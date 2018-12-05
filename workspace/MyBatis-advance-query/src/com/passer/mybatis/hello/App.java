package com.passer.mybatis.hello;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Test;

import com.passer.mybatis.hello.domain.User;
import com.passer.mybatis.hello.mapper.UserMapper;
import com.passer.mybatis.hello.query.UserObjectQuery;
import com.passer.mybatis.hello.service.impl.UserService;
import com.passer.mybatis.util.MyBatisUtil;

public class App {
	
	//测试分页查询和高级查询
	@Test
	public void testName() throws Exception {
		UserService service = new UserService();
		UserObjectQuery qo = new UserObjectQuery();
		qo.setCurrentPage(1);
		qo.setPageSize(3);
		List<?> users = service.query(qo).getResultList();
		for (Object user : users) {
			System.out.println(user);
		}
	}
	//测试高级查询
	@Test
	public void testQuery() throws Exception {
		UserMapper mapper = MyBatisUtil.getMapper(UserMapper.class);
		UserObjectQuery qo = new UserObjectQuery();
		qo.setKeyword("p");
		qo.setDeptid(10L);
		qo.setMinSalary(new BigDecimal("3000"));
		qo.setMaxSalary(new BigDecimal("20000"));
		List<User> users = mapper.query(qo);
		for (User user : users) {
			System.out.println(user);
		}
	} 
	//测试查询结果记录总数
	@Test
	public void testQueryForCount() throws Exception {
		UserMapper mapper = MyBatisUtil.getMapper(UserMapper.class);
		UserObjectQuery qo = new UserObjectQuery();
		qo.setKeyword("p");
		qo.setDeptid(10L);
		qo.setMinSalary(new BigDecimal("3000"));
		qo.setMaxSalary(new BigDecimal("20000"));
		System.out.println(mapper.queryForCount(qo));
	}
	@Test
	public void testGetUser() throws Exception {
		UserMapper mapper = MyBatisUtil.getMapper(UserMapper.class);
		mapper.getUser(new BigDecimal("3000"));
	}
}
