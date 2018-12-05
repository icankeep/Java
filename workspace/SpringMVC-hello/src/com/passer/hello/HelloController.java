package com.passer.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController{

	@RequestMapping("/hello")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("hello...");
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/WEB-INF/views/welcome.jsp");
		mv.addObject("msg","oh ! my god!");
		return mv;
	}

}
