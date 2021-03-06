package com.passer.smis.handler;

import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.passer.smis.util.IResultSetHandler;

public class BeanListHandler<T> implements IResultSetHandler<List<T>> {
	private Class<T> classType;
	
	public BeanListHandler(Class <T> classType) {
		this.classType=classType;
	}
	@Override
	public List<T> handler(ResultSet rs) throws Exception {
		List <T> list=new ArrayList<>();
		PropertyDescriptor [] pds=Introspector.getBeanInfo(classType,Object.class).getPropertyDescriptors();
		while(rs.next()) {
			T obj=classType.newInstance();
			for (PropertyDescriptor pd : pds) {
				pd.getWriteMethod().invoke(obj,rs.getObject(pd.getName()));
			}
			list.add(obj);
		}
		return list;
	}

}
