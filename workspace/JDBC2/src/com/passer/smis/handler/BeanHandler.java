package com.passer.smis.handler;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.sql.ResultSet;

import com.passer.smis.util.IResultSetHandler;

//表示把结果集中的一行数据，封装成一个对象，专门针对结果集只有一行数据的情况
public class BeanHandler<T> implements IResultSetHandler<T> {
	// 把结果集中的一行数据，封装成什么类型的对象
	private Class<T> classType;

	public BeanHandler(Class<T> classType) {
		this.classType = classType;
	}
	
	@Override
	public T handler(ResultSet rs) throws Exception {
		T obj=classType.newInstance();
		BeanInfo info=Introspector.getBeanInfo(classType,Object.class);
		PropertyDescriptor []pds=info.getPropertyDescriptors();
		if(rs.next()) {
			for (PropertyDescriptor pd : pds) {
				
				String column=pd.getName();
				Object val=rs.getObject(column);
				pd.getWriteMethod().invoke(obj,val);
			}
		}
		return obj;
	}

}
