package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.service.AddService;

@Controller
public class AddController {
	
	@RequestMapping("/add")
	public ModelAndView m1(HttpServletRequest req, HttpServletResponse resp) {
		int t1 = Integer.parseInt(req.getParameter("t1"));
		int t2 = Integer.parseInt(req.getParameter("t2"));
		
		AddService as = new AddService();
		int k = as.add(t1, t2);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("display");
		mav.addObject("result",k);
		return mav;
	}

}
