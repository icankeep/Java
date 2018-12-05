package com.passer.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie/list")
public class ListServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		//设置请求和响应编码
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		//获取参数
		String username = null;
		Cookie[] cookies = req.getCookies();
		for (Cookie cookie : cookies) {
			if("username".equals(cookie.getName())) {
				username = cookie.getValue();
			}
		}
		
		PrintWriter writer = resp.getWriter();
		writer.println("欢迎:"+username+"<br/>");
		writer.println("<a href='/cookie/get'>邮件<a/>");
		writer.println("<a href='/cookie/get'>邮件<a/>");
		writer.println("<a href='/cookie/get'>邮件<a/>");
		writer.println("<a href='/cookie/get'>邮件<a/>");
	}
}
