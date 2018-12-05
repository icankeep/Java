package com.dis.serve.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dis.serve.db.Detaildb;
import com.dis.serve.po.Commend;
import com.dis.serve.po.Policy;

/**
 * Servlet implementation class ShowDetail
 */
@WebServlet("/ShowDetail")
public class ShowDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		
		if(id.equals("commends")) {
			Commend c = Detaildb.showCom(name);
			request.setAttribute("COMMEND", c);
			request.setAttribute("FLAG", "commend");
		}else {
			Policy p = Detaildb.showPol(name);
			request.setAttribute("POLICY", p);
			request.setAttribute("FLAG", "policy");
		}
		request.getRequestDispatcher("/detail.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
