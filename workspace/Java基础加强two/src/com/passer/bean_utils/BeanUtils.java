package com.passer.bean_utils;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.HashMap;
import java.util.Map;

public class BeanUtils {
	
	//JavaBean转化为Map
	public static Map<String,Object> bean2Map(Object obj) throws Exception{
		Map<String,Object> map = new HashMap<>();
		BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass(),Object.class);
		PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
		for (PropertyDescriptor pd : pds) {
			map.put(pd.getName(), pd.getReadMethod().invoke(obj));
		}
		return map;
	}
	
	//Map转化为JavaBean
	public static <T>T map2Bean(Map<String,Object> map,Class<T> classType) throws Exception{
		T t = classType.newInstance();
		BeanInfo beanInfo = Introspector.getBeanInfo(classType,Object.class);
		PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
		for (PropertyDescriptor pd : pds) {
			pd.getWriteMethod().invoke(t, map.get(pd.getName()));
		}
		return t;
	}
}
