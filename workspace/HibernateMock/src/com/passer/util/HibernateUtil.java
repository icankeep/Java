package com.passer.util;

import java.lang.reflect.Field;

import com.passer.anno.ID;
import com.passer.anno.Table;

//Hibernate工具类
public class HibernateUtil {
	/**
	 * 从注解中获取模型对象对应的表名
	 * @param obj		需要获取表名的模型对象
	 * @return			返回相应的表名,如果未在注解中写上表名,返回该模型对象类名
	 */
	public static String getTableName(Object obj) {
		Class<?> clz = obj.getClass();
		Table table = (Table) clz.getDeclaredAnnotation(Table.class);
		return table.value() == null ? obj.getClass().getSimpleName() : table.value();
	}
	
	/**
	 * 判断对象对应字段是否是主键字段
	 * @param obj			需要查询的对象
	 * @param fieldName		对应的字段名
	 * @return				若对应字段上有ID注解，则返回true，否则返回false
	 */
	public static boolean isPrimaryKey(Object obj,String fieldName) {
		Field[] fields = obj.getClass().getDeclaredFields();
		for (Field field : fields) {
			if(fieldName.equals(field.getName())&&field.isAnnotationPresent(ID.class)) {
				return true;
			}
		}
		return false;
	}
}
