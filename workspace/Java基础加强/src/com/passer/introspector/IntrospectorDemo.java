package com.passer.introspector;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

public class IntrospectorDemo {

	public static void main(String[] args) throws Exception {
		BeanInfo info=Introspector.getBeanInfo(User.class,Object.class);
		PropertyDescriptor []pds=info.getPropertyDescriptors();
		User user=User.class.newInstance();
		System.out.println(user);
		for(PropertyDescriptor pd : pds) {
			System.out.println(pd.getName());
			System.out.println(pd.getReadMethod());
			System.out.println(pd.getWriteMethod());
			System.out.println("---------------");
			if("descri".equals(pd.getName())) {
				Method m=pd.getWriteMethod();
				m.invoke(user,"passer");				
			}
		}
		System.out.println(user);
		
	}

}
