//package com.passer.smis.handler;
//import java.sql.ResultSet;
//import java.util.ArrayList;
//import java.util.List;
//
//import com.passer.smis.domain.Student;
//import com.passer.smis.util.IResultSetHandler;
//
//public class StudentResultSetHandler implements IResultSetHandler<List<Student>> {
//	@Override
//	public List<Student> handler(ResultSet rs) throws Exception {
//		List<Student> list=new ArrayList<>();
//		while(rs.next()) {
//			Student stu=new Student();
//			stu.setAge(rs.getInt("age"));
//			stu.setName(rs.getString("name"));
//			stu.setId(rs.getLong("id"));
//			list.add(stu);
//		}
//		return list;
//	}
//}
