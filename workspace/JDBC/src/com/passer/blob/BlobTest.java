package com.passer.blob;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.Test;

import com.passer.smis.util.JdbcUtil;

public class BlobTest {
	@Test
	public void testBlobUp() throws Exception {
		String sql="INSERT INTO t_image (image) VALUES(?)";
		Connection conn=JdbcUtil.getConnection();
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setBlob(1,new FileInputStream("D:/psb.jpg"));
		ps.executeUpdate();
		JdbcUtil.close(conn,ps,null);
	}
	
	@Test
	public void testBlobDown() throws Exception {
		String sql="SELECT image FROM t_image WHERE id=?";
		Connection conn=JdbcUtil.getConnection();
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setLong(1, 2L);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			Blob blob=rs.getBlob("image");
			InputStream in=blob.getBinaryStream();
			Files.copy(in,Paths.get("D:/123.txt"));
		}
	}
}
