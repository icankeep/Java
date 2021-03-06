package com.passer.servlet;

import java.io.IOException;
import java.io.Serializable;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public abstract class MyGenericServlet 
implements Servlet,Serializable,ServletConfig{
	
	private static final long serialVersionUID = 1L;
	private ServletConfig config = null;
	
	public void init(ServletConfig config) throws ServletException {
		this.config = config; 
		this.init();
	}

	public void init() {
		// NOOP
	}

	public ServletConfig getServletConfig() {
		return this.config;
	}

	abstract public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException;

	public void destroy() {
	}

	public String getServletInfo() {
		return null;
	}
	
	public String getServletName() {
		return config.getServletName();
	}

	public ServletContext getServletContext() {
		return config.getServletContext();
	}

	public String getInitParameter(String name) {
		return config.getInitParameter(name);
	}

	public Enumeration<String> getInitParameterNames() {
		return config.getInitParameterNames();
	}
	

}
