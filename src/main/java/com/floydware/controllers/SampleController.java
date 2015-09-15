package com.floydware.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {

	private String helloView = "HelloWorld";

	@RequestMapping(value = "/hello.htm", method = RequestMethod.GET)
	public ModelAndView helloWorld() {
		ModelAndView mav = new ModelAndView(helloView);

		mav.addObject("msg", "Shall we play a game?");

		return mav;
	}

	public Integer doStuff() {
		return null;
	}
}
