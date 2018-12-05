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
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out=resp.getWriter();
		
		String username=req.getParameter("username");
		Cookie cookie=new Cookie("currentName",username);
		resp.addCookie(cookie);
		out.println("欢迎："+username);
		for(int i=0;i<5;i++) {
			out.println("<a href=/cookie/list/article>article</a>");
		}
	}
}
