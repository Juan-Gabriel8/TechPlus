package com.spring.techplus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.techplus.model.Post;
import com.spring.techplus.service.TechplusService;

@Controller
public class TechplusController {
	
	@Autowired
	TechplusService techplusService;
	
	@RequestMapping(value = "/posts", method = RequestMethod.GET)
	public ModelAndView getPosts() {
		ModelAndView mv = new ModelAndView("posts");
		List<Post> posts = techplusService.findAll();
		mv.addObject("posts", posts);
		return mv;
		
	}
}