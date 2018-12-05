package com.passer.introspector;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class BeanUtil {
	public static void main(String []args) throws Exception {
		User user=new User();
		user.setName("passer");
		user.setDescri("cool");
		Map<Object,Object> map=bean2map(user);
		System.out.println(map);
		
		Object obj=map2bean(map,User.class);
		System.out.println(obj);
	}

	private static <T> T map2bean(Map<Object,Object> map,Class<T> beanType) throws Exception {
		T t=beanType.newInstance();
		PropertyDescriptor [] pds=Introspector.getBeanInfo(beanType,Object.class)
				.getPropertyDescriptors();
		for (PropertyDescriptor pd : pds) {
			for (Entry entry : map.entrySet()) {
				if(entry.getKey().equals(pd.getName())) {
					pd.getWriteMethod().invoke(t, entry.getValue());
				}
			}
		}
		return t;
	}
	
	private static Map<Object,Object> bean2map(Object bean) throws Exception {
		
		Map<Object,Object> map=new HashMap<>();
		BeanInfo info=Introspector.getBeanInfo(bean.getClass(),Object.class);
		PropertyDescriptor []pds=info.getPropertyDescriptors();
		for(PropertyDescriptor pd:pds) {
			Object key=pd.getName();
			Object value= pd.getReadMethod().invoke(bean);
			map.put(key, value);
		}		
		return map;		
	}
}
