package com.passer.extends_servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet1 extends MyGenericServlet {
	public void init() {
		System.out.println("子类的初始化操作");
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		Enumeration<String> en = super.getInitParameterNames();
		while (en.hasMoreElements()) {
			String param = en.nextElement();
			System.out.println(param + "," + super.getInitParameter(param));
		}
	}
}
