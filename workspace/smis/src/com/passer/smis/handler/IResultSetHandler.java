package com.passer.smis.handler;

import java.sql.ResultSet;

/**
 * 定义处理结果集规范
 * @author passer
 *
 * @param <T>	返回T类型的处理之后的结果集
 */
public interface IResultSetHandler<T> {
	
	/**
	 * 处理结果集
	 * @param rs	结果集
	 * @return		返回处理好的结果并封装成T对象
	 * @throws Exception
	 */
	T handle (ResultSet rs) throws Exception;
}
