package com.passer.smis.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.passer.smis.dao.IUserDAO;
import com.passer.smis.dao.impl.UserDAOImpl;
import com.passer.smis.domain.User;

@WebServlet("/user/save")
public class SaveServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	private IUserDAO dao;
	
	public void init() throws ServletException {
		dao = new UserDAOImpl();
	}
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String sid = req.getParameter("id");
		String name = req.getParameter("name");
		Integer age = Integer.valueOf(req.getParameter("age"));
		User user = new User(name,age);
		if(hasLength(sid)) {
			dao.update(Long.valueOf(sid), user);
		}else {
			dao.save(user);
		}
		resp.sendRedirect("/user/list");
	}
	
	private boolean hasLength (String str) {
		return str!=null && !"".equals(str.trim());
	}
}
