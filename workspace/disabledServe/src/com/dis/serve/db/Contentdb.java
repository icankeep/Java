package com.dis.serve.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dis.serve.po.Commend;
import com.dis.serve.po.Hotkey;
import com.dis.serve.po.Picture;
import com.dis.serve.po.Policy;


public class Contentdb {
	static ResultSet rs;
	public static List<Hotkey> getAllkey() {
		List<Hotkey> list = new ArrayList<Hotkey>();
		String sql = "select * from keywords ORDER BY kid DESC limit 3";
		try {
			rs = Mydb.getSmt().executeQuery(sql);
			while(rs.next()) {
				Hotkey h = new Hotkey();
				h.setKeyword(rs.getString(2));
				list.add(h);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;		
	}
	public static List<Commend> getAllCom() {
		List<Commend> list = new ArrayList<Commend>();
		String sql = "select * from commends ORDER BY cid DESC limit 6";
		try {
			rs = Mydb.getSmt().executeQuery(sql);
			while(rs.next()) {
				Commend c = new Commend();
				c.setComname(rs.getString(2));
				c.setComcontent(rs.getString(3));
				list.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
	public static List<Policy> getAllPol(){
		List<Policy> list = new ArrayList<Policy>();
		String sql = "select * from policys ORDER BY pid DESC limit 6";
		try {
			rs = Mydb.getSmt().executeQuery(sql);
			while(rs.next()) {
				Policy p = new Policy();
				p.setPolname(rs.getString(2));
				p.setPolcontent(rs.getString(3));
				list.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
	public static List<Picture> getAllPic(){
		List<Picture> list = new ArrayList<Picture>();
		String sql = "select * from pictures where flag=0 ORDER BY pid DESC limit 4";
		try {
			rs = Mydb.getSmt().executeQuery(sql);
			while(rs.next()) {
				Picture p = new Picture();
				p.setPicname(rs.getString(2));
				p.setPicaddress(rs.getString(3));
				list.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
	public static Picture getBg(){
		Picture p = new Picture();
		String sql = "select * from pictures where flag=1 ORDER BY pid DESC limit 1";
		try {
			rs = Mydb.getSmt().executeQuery(sql);
			if(rs.next()) {
				p.setPicaddress(rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;		
	}
	
	public static List<Commend> getLikeCom(String key) {
		List<Commend> list = new ArrayList<Commend>();
		String sql = "select * from commends where comname like '%"+key+"%'  ORDER BY cid DESC";
		try {
			rs = Mydb.getSmt().executeQuery(sql);
			while(rs.next()) {
				Commend c = new Commend();
				c.setComname(rs.getString(2));
				c.setComcontent(rs.getString(3));
				list.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
	public static List<Policy> getLikePol(String key) {
		List<Policy> list = new ArrayList<Policy>();
		String sql = "select * from policys where polname like '%"+key+"%'  ORDER BY pid DESC";
		try {
			rs = Mydb.getSmt().executeQuery(sql);
			while(rs.next()) {
				Policy p = new Policy();
				p.setPolname(rs.getString(2));
				p.setPolcontent(rs.getString(3));
				list.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
}
