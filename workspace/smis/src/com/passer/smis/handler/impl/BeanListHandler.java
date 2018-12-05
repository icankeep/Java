package com.passer.smis.handler.impl;

import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.passer.smis.handler.IResultSetHandler;

//表示把结果集中的多行数据，每行封装成一个对象，每个对象存入List中
public class BeanListHandler<T> implements IResultSetHandler<List<T>>{

	private Class<T> classType;
	
	public BeanListHandler(Class<T> classType) {
		this.classType = classType;
	}
	
	public List<T> handle(ResultSet rs) throws Exception {
		T obj = null;
		List<T> list = new ArrayList<>();
		PropertyDescriptor[] propertyDescriptors = 
				Introspector.getBeanInfo(classType,Object.class).getPropertyDescriptors();
		while(rs.next()) {
			obj = classType.getDeclaredConstructor().newInstance();
			for (PropertyDescriptor pd : propertyDescriptors) {
				pd.getWriteMethod().invoke(obj, rs.getObject(pd.getName()));
			}
			list.add(obj);
		}
		return list;
	}

}
