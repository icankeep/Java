package com.passer.extends_servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyHttpServlet extends MyGenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		service(request, response);
	}

	public void service(HttpServletRequest req, HttpServletResponse res) {
		String method = req.getMethod();
		if ("GET".equals(method)) {
			doGet(req, res);
		} else if ("POST".equals(method)) {
			doPost(req, res);
		}
	}

	private void doPost(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("doPost");
	}

	private void doGet(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("doGet");
	}

}
