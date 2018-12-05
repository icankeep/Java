package com.dis.serve.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dis.serve.db.Managedb;

/**
 * Servlet implementation class UpTitle2
 */
@WebServlet("/UpTitle2")
public class UpTitle2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String flag = request.getParameter("flag");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String content = request.getParameter("content");
		Managedb.updateTit(id, name, content, flag);
		request.getRequestDispatcher("/Allcom").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
