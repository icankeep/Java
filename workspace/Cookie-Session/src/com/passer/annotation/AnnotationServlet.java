package com.passer.annotation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(value= {"/a","*.py"},
//			initParams= {@WebInitParam(name="username",value="passer"),
//						 @WebInitParam(name="password",value="12345")
//			})

@WebServlet(value="/a",loadOnStartup=1)
public class AnnotationServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse reps) 
			throws ServletException, IOException {
		System.out.println(super.getInitParameter("username"));
		System.out.println(super.getInitParameter("password"));
	}
	
}
