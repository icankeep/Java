package com.passer.sql_injection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

import com.passer.smis.util.JdbcUtil;

public class SQLInjectionTest {
	@Test 
	public void test() throws Exception {
		
		String sql = "SELECT * FROM t_user WHERE name ='' OR 1 = 1 OR '' AND age = 200";
		Connection conn = JdbcUtil.getConnection();
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		if(!rs.next()) {
			System.out.println("登录失败");
		}else {
			System.out.println("登录成功");
		}
	}
}
