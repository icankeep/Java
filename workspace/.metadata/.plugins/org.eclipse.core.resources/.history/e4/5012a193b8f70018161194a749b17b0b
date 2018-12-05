package com.passer.forward;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/forward/servlet2")
public class Servlet2 extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		System.out.println("Servlet2");
		String username = (String) req.getAttribute("username");
		PrintWriter writer = resp.getWriter();
		writer.write("servlet2...");
		System.out.println(username);
		
	}
}
