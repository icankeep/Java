package com.passer.response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/resp")
public class HttpServletResponseDemo extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
    protected void service(HttpServletRequest req, HttpServletResponse resp) 
    		throws ServletException, IOException {
    	resp.setContentType("text/html;charset=utf-8");
    	PrintWriter out=resp.getWriter();
    	out.println("哈哈哈");
    	out.println("<br/>");
    	out.println("哈哈哈");
    }
}
