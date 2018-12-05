package com.passer.cal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cal")
public class CalServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		
		String sNum1=req.getParameter("num1");
		String sNum2=req.getParameter("num2");
		String op=req.getParameter("op");
		String result="";
		if(hasLength(sNum1)&&hasLength(sNum2)) {
			switch(op) {
			case "+" : result=Double.valueOf(sNum1)+Double.valueOf(sNum2)+"";break;
			case "-" :	result=Double.valueOf(sNum1)-Double.valueOf(sNum2)+"";break;
			case "*" :	result=Double.valueOf(sNum1)*Double.valueOf(sNum2)+"";break;
			case "/" :	result=Double.valueOf(sNum1)/Double.valueOf(sNum2)+"";break;
			}
		}
		
		PrintWriter out=resp.getWriter();
		out.println("<form action='/cal' method='post'>");
		out.println("<input type='number' name='num1' value='"+sNum1+"'>");
		out.println("<select name='op'>");
		out.println("<option>+</option> ");
		out.println("<option>-</option>");
		out.println("<option>*</option>");
		out.println("<option>/</option>");
		out.println("</select>");
		out.println("<input type='number' name='num2' value='"+sNum2+"'>");
		out.println("<input type='submit' value='='>");
		out.println("<input type='number' value='"+result+"'>");
		out.println("</form>");
	}
	
	public boolean hasLength(String str) {
		return str!=null&&!"".equals(str.trim());
	}
}
