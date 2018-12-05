package com.passer.smis.util;

import java.sql.ResultSet;

public interface IResultSetHandler <T>{
	T handler(ResultSet rs) throws Exception;
}
