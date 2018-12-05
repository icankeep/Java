package com.dis.serve.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dis.serve.db.Userdb;

/**
 * Servlet implementation class LoginCheck
 */
@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		//username = new String(username.getBytes("iso8859-1"),"UTF-8");
		String password = request.getParameter("password");
		String id = request.getParameter("radio");
				
			if(Userdb.findOne(username, password, id)) {
				HttpSession session = request.getSession();
			    session.setAttribute("USERNAME", username);
			    if(id.equals("1"))
				request.getRequestDispatcher("/IndexContent").forward(request, response);
			    else
			    request.getRequestDispatcher("/home.jsp").forward(request, response);
			}else {
				request.setAttribute("key", 1);
				request.getRequestDispatcher("/login.jsp").forward(request, response); 
		    }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
