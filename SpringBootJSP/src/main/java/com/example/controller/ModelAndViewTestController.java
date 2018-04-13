package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModelAndViewTestController {
	
	@RequestMapping(value="/mv")
	public ModelAndView root() {
		ModelAndView mv = new ModelAndView();
		
		List<String> listTest = new ArrayList<String>();
		
		listTest.add("test1");
		listTest.add("test2");
		listTest.add("test3");
		
		mv.addObject("listTest", listTest);
		mv.addObject("ObjectTest", "테스트입니다.");
		mv.setViewName("mv/testMv");
		
		return mv;
	}

}
