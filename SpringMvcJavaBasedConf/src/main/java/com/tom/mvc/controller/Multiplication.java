package com.tom.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tom.services.Multi_Services;

@Controller
public class Multiplication {
   
	@RequestMapping("/mult")
	public ModelAndView getMultiply(@RequestParam("n1")int x,@RequestParam("n2")int y,HttpServletRequest request,HttpServletResponse response) {
		
		Multi_Services mp=new Multi_Services();
		int z=mp.getMultiplication(x, y);
		ModelAndView mv=new ModelAndView();
		mv.addObject("result_multi",z);
		mv.setViewName("multi_page");
		return mv;
	}
}
