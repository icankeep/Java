package com.passer.scope;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/scope/servlet1")
public class Servlet1 extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		String username1 = "Request";
		String username2 = "Session";
		String username3 = "ServletContext";
		//放在请求中
		req.setAttribute("username1", username1);
		req.getSession().setAttribute("username2", username2);
		req.getServletContext().setAttribute("username3", username3);
		
		//请求转发
		req.getRequestDispatcher("/scope/servlet2").forward(req, resp);
	}
}
