package com.passer.smis.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.passer.smis.dao.IUserDAO;
import com.passer.smis.dao.impl.UserDAOImpl;
import com.passer.smis.domain.User;

@WebServlet("/user/edit")
public class EditServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	private IUserDAO dao;
	
	public void init() throws ServletException {
		dao = new UserDAOImpl();
	}
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		String sid = req.getParameter("id");
		if(hasLength(sid)) {
			Long id = Long.valueOf(sid);
			User user = dao.get(id);
			req.setAttribute("user", user);
		}
		req.getRequestDispatcher("/WEB-INF/edit.jsp").forward(req, resp);
	}
	
	private boolean hasLength (String str) {
		return str!=null && !"".equals(str.trim());
	}
}
