package com.passer.initparam;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class InitParam implements Servlet{

	private ServletConfig config;
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config=config;
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		Enumeration<String> en = config.getInitParameterNames();
		while(en.hasMoreElements()) {
			String param=en.nextElement();
			System.out.println(param+","+config.getInitParameter(param));
		}
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void destroy() {
	}
	
}
