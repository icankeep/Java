package com.passer.dbcp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSourceFactory;

public class DBCPUtil {
	private static Properties p=new Properties();
	private static DataSource ds=null;
	static {
		try {
			p.load(Thread.currentThread().getContextClassLoader().
					getResourceAsStream("dbcp.properties"));
			ds=BasicDataSourceFactory.createDataSource(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		try {
			return ds.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void close(Connection conn,Statement st,ResultSet rs) {
		try {
			if(rs!=null) {
				rs.close();
			}
		} catch (Exception e) {
		} finally {
			try {
				if(st!=null) {
					st.close();
				}
			} catch (Exception e) {
			} finally {
				try {
					if(conn!=null) {
						conn.close();
					}
				} catch (Exception e) {
				} 
			}
		}
	}
}
