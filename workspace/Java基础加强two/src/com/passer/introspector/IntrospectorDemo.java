package com.passer.introspector;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

public class IntrospectorDemo {
	
	public static void main(String[] args) throws Exception {
		
		BeanInfo beanInfo = Introspector.getBeanInfo(User.class,Object.class);
		PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
		User user = User.class.newInstance();
		System.out.println(user);
		for (PropertyDescriptor pd : pds) {
			System.out.println("属性名："+pd.getName());
			System.out.println(pd.getReadMethod());
			System.out.println(pd.getWriteMethod());
			if("name".equals(pd.getName())) {
				pd.getWriteMethod().invoke(user, "will");
			}
		}
		System.out.println(user);
	}
}
