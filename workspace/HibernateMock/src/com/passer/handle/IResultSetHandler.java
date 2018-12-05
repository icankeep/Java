package com.passer.handle;

import java.sql.ResultSet;

public interface IResultSetHandler<T> {
	public T handle(ResultSet rs) throws Exception;
}
