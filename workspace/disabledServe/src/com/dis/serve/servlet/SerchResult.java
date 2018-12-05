package com.dis.serve.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dis.serve.db.Contentdb;
import com.dis.serve.po.Commend;
import com.dis.serve.po.Policy;

/**
 * Servlet implementation class SerchResult
 */
@WebServlet("/SerchResult")
public class SerchResult extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String key = request.getParameter("key");
		List<Commend> listc = Contentdb.getLikeCom(key);
	    List<Policy> listpo = Contentdb.getLikePol(key);
	        
	    request.setAttribute("LIST1", listc);
	    request.setAttribute("LIST2", listpo);
	    request.getRequestDispatcher("/list.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
