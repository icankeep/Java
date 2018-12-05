package com.passer.forward;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/forward/servlet1")
public class Servlet1 extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		req.setAttribute("username", "abc");
		System.out.println("Servlet1 begin...");
		req.getRequestDispatcher("/servlet2").forward(req, resp);;
		System.out.println("Servlet1 after...");
	}
}
