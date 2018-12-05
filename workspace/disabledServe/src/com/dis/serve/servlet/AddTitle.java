package com.dis.serve.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dis.serve.db.Managedb;

/**
 * Servlet implementation class AddTitle
 */
@WebServlet("/AddTitle")
public class AddTitle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String kind = request.getParameter("kind");
		String content = request.getParameter("content");
		Managedb.insertTit(name, content, kind);
		if(kind.equals("1")) {			
			request.getRequestDispatcher("/Allcom").forward(request, response);
		}else {
			request.getRequestDispatcher("/Allpol").forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
