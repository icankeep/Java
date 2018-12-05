package com.passer.smis.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public class JdbcUtil {
	
	private static DataSource dataSource;
	
	static {
		Properties properties = new Properties();
		try {
			properties.load(Thread.currentThread().
					getContextClassLoader().getResourceAsStream("db.properties"));
			Class.forName(properties.getProperty("driverClassName"));
			dataSource = DruidDataSourceFactory.createDataSource(properties);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		try {
			return dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void close(Connection conn,Statement st,ResultSet rs) {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				if(st!=null) {
					try {
						st.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}finally {
						if(conn!=null) {
							try {
								conn.close();
							} catch (SQLException e) {
								e.printStackTrace();
							}
						}
					}
				}
			}
		}
	}
}
