package com.passer.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyHttpServlet extends MyGenericServlet{
	
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		service(request,response);
	}
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String method = req.getMethod();
		if("GET".equals(method)) {
			doGet();
		}else if("POST".equals(method)) {
			doPost();
		}
	}

	public void doPost() {
		System.out.println("MyHttpServlet.doPost()");
	}

	public void doGet() {
		System.out.println("MyHttpServlet.doGet()");
	}

}
