package com.passer.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class DDLTest {

	
	//创建数据库连接，并通过JDBC操作数据库创建表
	@Test
	public void testDML() {
		String sql = "CREATE TABLE t_user (id bigint(20) PRIMARY KEY AUTO_INCREMENT,name varchar(20),age int(3) UNSIGNED NOT NULL)";
		Connection conn = null;
		Statement st = null;
		try {
			//加载注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			//获取连接对象
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_user", "root", "admin");
			//创建语句对象
			st = conn.createStatement();
			//执行语句对象
			st.execute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//释放资源
			try {
				if(st!=null) {
					st.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(conn!=null) {
						conn.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		}
	}
}
