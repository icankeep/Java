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
import com.dis.serve.po.Hotkey;
import com.dis.serve.po.Picture;
import com.dis.serve.po.Policy;

@WebServlet("/IndexContent")
public class IndexContent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    List<Commend> listc = Contentdb.getAllCom();
	    List<Policy> listpo = Contentdb.getAllPol();
	    List<Picture> listpi = Contentdb.getAllPic();
	    List<Hotkey> hk = Contentdb.getAllkey();
	    Picture p = Contentdb.getBg();
	    
	    request.setAttribute("LISTC", listc);
	    request.setAttribute("LISTPO", listpo);
	    request.setAttribute("LISTPI", listpi);
	    request.setAttribute("KEY", hk);
	    request.setAttribute("BG", p);
	    	    
	    request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
