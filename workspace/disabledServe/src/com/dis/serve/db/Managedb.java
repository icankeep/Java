package com.dis.serve.db;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dis.serve.po.Commend;
import com.dis.serve.po.Hotkey;
import com.dis.serve.po.Picture;
import com.dis.serve.po.Policy;
import com.dis.serve.po.RequestSub;

public class Managedb {
	static ResultSet rs;
	
	//上传文件，如果不存在文件夹则自动创建
	public static boolean mkDirectory(String path) {		
		File file = null;		
		try {			
			file = new File(path);			
			if (!file.exists()) {				
				return file.mkdirs();			
			}else{				
				return false;			
			}		
		} catch (Exception e) {		

		} finally {			
			file = null;		
		}		
		return false;	
	}
	
	public static List<Hotkey> getAllkey(){
		List<Hotkey> list = new ArrayList<Hotkey>();
		String sql = "select * from keywords order by kid desc";
		try {
			rs = Mydb.getSmt().executeQuery(sql);
			while(rs.next()) {
				Hotkey h = new Hotkey();
                h.setKid(Integer.parseInt(rs.getString(1)));
				h.setKeyword(rs.getString(2));
				list.add(h);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return list;		
	}
	
	public static List<RequestSub> getAllreq(){
		List<RequestSub> list = new ArrayList<RequestSub>();
		String sql = "select * from requests order by rid desc";
		try {
			rs = Mydb.getSmt().executeQuery(sql);
			while(rs.next()) {
				RequestSub r = new RequestSub();
                r.setRid(Integer.parseInt(rs.getString(1)));
                r.setUsername(rs.getString(2));
                r.setMobile(rs.getString(3));
                r.setSex(rs.getString(4));
                r.setKind(rs.getString(5));
                r.setContent(rs.getString(6));			
				list.add(r);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return list;		
	}
	
	public static void deleteReq(String id) {
		String sql = "delete from requests where rid='"+id+"'";
		try {
			Mydb.getSmt().executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void insertHk(String keyword) {
		String sql = "insert into keywords(keyword) values('"+keyword+"')";
		try {
			Mydb.getSmt().executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void deleteHk(String kid) {
		String sql = "delete from keywords where kid='"+kid+"'";
		try {
			Mydb.getSmt().executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static List<Commend> getAllCom() {
		List<Commend> list = new ArrayList<Commend>();
		String sql = "select * from commends ORDER BY cid DESC";
		try {
			rs = Mydb.getSmt().executeQuery(sql);
			while(rs.next()) {
				Commend c = new Commend();
				c.setCid(Integer.parseInt(rs.getString(1)));
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
		String sql = "select * from policys ORDER BY pid DESC";
		try {
			rs = Mydb.getSmt().executeQuery(sql);
			while(rs.next()) {
				Policy p = new Policy();
				p.setPid(Integer.parseInt(rs.getString(1)));
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
	public static void insertTit(String name, String content,String flag) {
		String sql = null;
		if(flag.equals("1"))
			sql = "insert into commends(comname,comcontent) values('"+name+"','"+content+"')";
		else
			sql = "insert into policys(polname,polcontent) values('"+name+"','"+content+"')";
		try {
			Mydb.getSmt().executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void deleteTit(String kid,String flag) {
		String sql = null;
		if(flag.equals("1"))
			sql = "delete from commends where cid='"+kid+"'";
		else
			sql = "delete from policys where pid='"+kid+"'";
		try {
			Mydb.getSmt().executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void updateTit(String id, String name, String content, String flag) {
		String sql = null;
		if(flag.equals("1"))
			sql = "update commends set comname='"+name+"',comcontent='"+content+"' where cid='"+id+"'";
		else
			sql = "update policys set polname='"+name+"',polcontent='"+content+"' where pid='"+id+"'";
		try {
			Mydb.getSmt().executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Object getOneTit(String kid,String flag) {
		String sql = null;
		if(flag.equals("1")) {
			Commend c = new Commend();
			sql = "select * from commends where cid='"+kid+"'";
			try {
				rs = Mydb.getSmt().executeQuery(sql);
				if(rs.next()) {
				c.setCid(Integer.parseInt(rs.getString(1)));
				c.setComname(rs.getString(2));	
				c.setComcontent(rs.getString(3));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return c;
		} else {
			Policy p = new Policy();
			sql = "select * from policys where pid='"+kid+"'";
			try {
				rs = Mydb.getSmt().executeQuery(sql);
				if(rs.next()) {
					p.setPid(Integer.parseInt(rs.getString(1)));
					p.setPolname(rs.getString(2));
					p.setPolcontent(rs.getString(3));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return p;
		}
		
	}
	
	public static List<Picture> getAllPic(){
		List<Picture> list = new ArrayList<Picture>();
		String sql = "select * from pictures ORDER BY pid DESC";
		try {
			rs = Mydb.getSmt().executeQuery(sql);
			while(rs.next()) {
				Picture p = new Picture();
				p.setPid(Integer.parseInt(rs.getString(1)));
				p.setPicname(rs.getString(2));;
				list.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
	public static void insertPic(String name, String content, String id) {
		String sql = null;	
		if(id.equals("0"))
		sql = "insert into pictures(picname,picaddress,flag) values('"+name+"','"+content+"',0)";
		else
		sql = "insert into pictures(picname,picaddress,flag) values('"+name+"','"+content+"',1)";
		try {
			Mydb.getSmt().executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void deletePic(String kid) {
		String sql = null;		
		sql = "delete from pictures where pid='"+kid+"'";
		try {
			Mydb.getSmt().executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
