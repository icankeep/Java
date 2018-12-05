package com.passer.handle;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.sql.ResultSet;


public class BeanHandler<T> implements IResultSetHandler<T>{

	private Class<T> classType;
	public BeanHandler(Class<T> classType){
		this.classType = classType;
	}
	@Override
	public T handle(ResultSet rs) throws Exception {
		T t = classType.newInstance();
		BeanInfo beanInfo = Introspector.getBeanInfo(classType,Object.class);
		PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
		if(rs.next()) {
			for (PropertyDescriptor pd : pds) {
				pd.getWriteMethod().invoke(t, rs.getObject(pd.getName()));
			}
		}
		return t;
	}

}
