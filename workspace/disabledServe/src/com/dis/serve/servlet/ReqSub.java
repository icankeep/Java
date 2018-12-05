package com.dis.serve.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dis.serve.db.Reqdb;
import com.dis.serve.po.RequestSub;

/**
 * Servlet implementation class ReqSub
 */
@WebServlet("/ReqSub")
public class ReqSub extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		String mobile = request.getParameter("mobile");
		String sex = request.getParameter("sex");
		String kind = request.getParameter("kind");
		String content = request.getParameter("content");
		RequestSub r = new RequestSub(username,mobile,sex,kind,content);
		Reqdb.insertReq(r);
		request.setAttribute("key", 1);
		request.getRequestDispatcher("/form.jsp").forward(request, response);;
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
