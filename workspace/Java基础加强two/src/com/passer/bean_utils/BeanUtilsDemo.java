package com.passer.bean_utils;

import com.passer.introspector.User;

public class BeanUtilsDemo {
	public static void main(String[] args) throws Exception {
		User user = new User();
		user.setName("will");
		user.setMan(true);
		user.setAge(15);
		
		
		System.out.println(BeanUtils.bean2Map(user));
		System.out.println(BeanUtils.map2Bean(BeanUtils.bean2Map(user), User.class));
	}
}
