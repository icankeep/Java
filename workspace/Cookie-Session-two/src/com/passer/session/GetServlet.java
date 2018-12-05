package com.passer.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/session/get")
public class GetServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		//设置请求和响应编码
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		//获取参数
		String username = (String) req.getSession().getAttribute("username");
		
		PrintWriter writer = resp.getWriter();
		writer.println("欢迎:"+username+"<br/>");
		writer.println("This is an e-mail!");
	}
}
