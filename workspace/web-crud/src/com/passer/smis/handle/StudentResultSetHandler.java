package com.passer.smis.handle;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.passer.smis.domain.User;

public class StudentResultSetHandler implements IResultSetHandler<List<User>>{

	public List<User> handle(ResultSet rs) throws Exception {
		List<User> list = new ArrayList<>();
		while(rs.next()) {
			User user =new User();
			user.setId(rs.getLong("id"));
			user.setName(rs.getString("name"));
			user.setAge(rs.getInt("age"));
			list.add(user);
		}
		return list;
	}


}
