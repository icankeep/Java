package com.passer.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/session/login")
public class LoginServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		//设置请求和响应编码
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		
		//接收请求参数
		String username = req.getParameter("username");
		
		//往session中添加参数
		req.getSession().setAttribute("username", username);
		//设置响应
		PrintWriter writer = resp.getWriter();
		writer.println("欢迎:"+username+"<br/>");
		writer.println("<a href='/session/list'>收件箱<a/>");
	}
}
