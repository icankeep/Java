package com.passer.mybatis.hello;

import java.util.List;

import org.junit.Test;

import com.passer.mybatis.hello.domain.Employee;
import com.passer.mybatis.hello.mapper.DepartmentMapper;
import com.passer.mybatis.util.MyBatisUtil;

public class App {
	@Test
	public void testGet() throws Exception {
		DepartmentMapper deptMapper = MyBatisUtil.getMapper(DepartmentMapper.class);
		List<Employee> es = deptMapper.get(1L).getEmps();
		
		for (Employee e : es) {
			System.out.println(e);
		}
	}
}

