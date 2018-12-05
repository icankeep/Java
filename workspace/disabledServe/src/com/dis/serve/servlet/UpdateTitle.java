package com.dis.serve.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dis.serve.db.Managedb;
import com.dis.serve.po.Commend;
import com.dis.serve.po.Policy;

/**
 * Servlet implementation class UpdateTitle
 */
@WebServlet("/UpdateTitle")
public class UpdateTitle extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String word = request.getParameter("word");	
		if(id.equals("1")) {
			Commend c = (Commend) Managedb.getOneTit(word, id);
			request.setAttribute("UPP", null);
			request.setAttribute("UPC", c);
		}else {
			Policy p = (Policy) Managedb.getOneTit(word, id);
			request.setAttribute("UPC", null);
			request.setAttribute("UPP", p);
		}
		
		request.getRequestDispatcher("/updateTitle.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
