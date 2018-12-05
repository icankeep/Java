package com.dis.serve.servlet;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.dis.serve.db.Managedb;

/**
 * Servlet implementation class KeyManage
 */
@MultipartConfig
@WebServlet("/PicManage")
public class PicManage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");	
		
		if(id.equals("1")) {
			String name = request.getParameter("picname");			
			Part part = request.getPart("word");
			String fileName = getFileName(part);
			String mkDirectoryPath = "D:/eclipse/jee-oxygen/workspace/disabledServe/WebContent/images";
			String path = "images/"+fileName;
			if (Managedb.mkDirectory(mkDirectoryPath)) {			
				System.out.println(mkDirectoryPath + "建立完毕");		
				}else{			
					System.out.println(mkDirectoryPath + "建立失败！此目录或许已经存在！");		
					}
			writeTo(fileName, part);			
			Managedb.insertPic(name, path,"0");
			
		}
		else if(id.equals("3")) {
			String name = request.getParameter("picname");
			Part part = request.getPart("word");
			String fileName = getFileName(part);
			String mkDirectoryPath = "D:/eclipse-workspace/disabledServe/WebContent/images/";
			String path = "images/"+fileName;
			if (Managedb.mkDirectory(mkDirectoryPath)) {			
				System.out.println(mkDirectoryPath + "建立完毕");		
				}else{			
					System.out.println(mkDirectoryPath + "建立失败！此目录或许已经存在！");		
					}
			writeTo(fileName, part);			
			Managedb.insertPic(name, path,"1");
			
		}else {
			String word = request.getParameter("word");
			Managedb.deletePic(word);
		}
		
		request.getRequestDispatcher("/Allpic").forward(request, response);
	}
	
	//取得上传文件名    
	private String getFileName(Part part) {        
		String header = part.getHeader("Content-Disposition");        
		String fileName = header.substring(header.indexOf("filename=\"") + 10, header.lastIndexOf("\""));        
		return fileName;    
	}

	//存储文件    
	private void writeTo(String fileName, Part part) throws IOException, FileNotFoundException {        
		InputStream in = part.getInputStream();  
		OutputStream out = new FileOutputStream("D:/eclipse-workspace/disabledServe/WebContent/images/" + fileName);        
		byte[] buffer = new byte[1024];        
		int length = -1;        
		while ((length = in.read(buffer)) != -1) {            
			out.write(buffer, 0, length);        
		}         
		in.close();        
		out.close();    
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
