package com.passer.smis.handler.impl;

import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.sql.ResultSet;

import com.passer.smis.handler.IResultSetHandler;

//表示把结果集中的一行数据，封装成一个对象，专门针对结果集只有一行数据的情况
public class BeanHandler<T> implements IResultSetHandler<T>{

	private Class<T> classType;
	
	public BeanHandler(Class<T> classType) {
		this.classType = classType;
	}
	
	public T handle(ResultSet rs) throws Exception {
		T obj = classType.getDeclaredConstructor().newInstance();
		PropertyDescriptor[] propertyDescriptors = 
				Introspector.getBeanInfo(classType,Object.class).getPropertyDescriptors();
		while(rs.next()) {
			for (PropertyDescriptor pd : propertyDescriptors) {
				pd.getWriteMethod().invoke(obj, rs.getObject(pd.getName()));
			}
		}
		return obj;
	}
}
