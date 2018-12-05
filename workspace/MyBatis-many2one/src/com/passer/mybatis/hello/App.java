package com.passer.mybatis.hello;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.passer.mybatis.hello.domain.Department;
import com.passer.mybatis.hello.domain.Employee;
import com.passer.mybatis.hello.mapper.DepartmentMapper;
import com.passer.mybatis.hello.mapper.EmployeeMapper;
import com.passer.mybatis.util.MyBatisUtil;

public class App {

	
	@Test
	public void testSave() throws Exception {
		Department d = new Department();
		d.setName("学习部");
		
		Employee e1 = new Employee();
		e1.setName("张三");
		
		Employee e2 = new Employee();
		e2.setName("李四");
		
		e1.setDept(d);
		e2.setDept(d);
		
		SqlSession session = MyBatisUtil.getSession();
		DepartmentMapper deptMapper = session.getMapper(DepartmentMapper.class);
		deptMapper.save(d);
		
		EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
		employeeMapper.save(e1);
		employeeMapper.save(e2);
		
		session.commit();
		System.out.println(d);
	}
	
	@Test
	public void testGet() throws Exception {
		EmployeeMapper mapper = MyBatisUtil.getMapper(EmployeeMapper.class);
		Employee e = mapper.get(1L);
		
		/*DepartmentMapper deptMapper = MyBatisUtil.getMapper(DepartmentMapper.class);
		Department dept = deptMapper.get(e.getDept().getId());
		e.setDept(dept);*/
		System.out.println(e);
	}
	
	@Test
	public void testListAll() throws Exception {
		EmployeeMapper mapper = MyBatisUtil.getMapper(EmployeeMapper.class);
		List <Employee> es = mapper.listAll();
		for (Employee e : es) {
			System.out.println(e+" "+e.getDept());
		}
	}
}

