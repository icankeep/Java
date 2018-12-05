package com.passer.introspector;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.beanutils.converters.IntegerConverter;

public class BeanUtilsDemo {
	public static void main(String []args) throws Exception {
		User user=new User();
		Map<Object,Object> map=new HashMap<>();
		map.put("name", "");
		map.put("descri", "cool");
		map.put("age", "");
		map.put("birthday", "");
		System.out.println(user);
		
		DateConverter dateConverter=new DateConverter(null);
		dateConverter.setPattern("yyyy-MM-dd");
		ConvertUtils.register(dateConverter, Date.class);
		
		ConvertUtils.register(new IntegerConverter(null), Integer.class);
		
		
		BeanUtils.copyProperties(user,map); //copyProperties(dest,src);
		System.out.println(user);
		
	}
}
