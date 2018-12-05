package com.passer.ddl_exception;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.junit.Test;

public class DDLTest {
	@Test
	public void testCreateTable() throws Exception {
		String sql="CREATE TABLE `t_student` (\r\n" + 
				"  `id` int(11) NOT NULL AUTO_INCREMENT,\r\n" + 
				"  `name` varchar(30) NOT NULL,\r\n" + 
				"  `age` int(10) DEFAULT '18',\r\n" + 
				"  PRIMARY KEY (`id`)\r\n" + 
				") ENGINE=InnoDB DEFAULT CHARSET=utf8;\r\n" + 
				"";
		//加载注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//获取连接数据库对象
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_database", "root", "admin");
		//创建语句对象
		Statement state=conn.createStatement();
		//执行SQL语句
		state.executeUpdate(sql);
		//关闭资源
		state.close();
		conn.close();
	}
	
	@Test
	public void testHandleException() throws Exception {
		String sql="CREATE TABLE `t_student` (\r\n" + 
				"  `id` int(11) NOT NULL AUTO_INCREMENT,\r\n" + 
				"  `name` varchar(30) NOT NULL,\r\n" + 
				"  `age` int(10) DEFAULT '18',\r\n" + 
				"  PRIMARY KEY (`id`)\r\n" + 
				") ENGINE=InnoDB DEFAULT CHARSET=utf8;\r\n" + 
				"";
		Connection conn=null;
		Statement st=null;
		try {
			//加载注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			//获取连接对象
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_database", "root", "admin");
			//创建语句对象
			st = conn.createStatement();
			//执行sql语句
			st.executeUpdate(sql);		
		}catch(Exception e){
			e.printStackTrace();
		}finally {
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
