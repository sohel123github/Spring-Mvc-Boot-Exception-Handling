package com.exceptionhandling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping(value = "/welcome")
	public String welcome(Model model) {
		model.addAttribute("msg", "Sohel Welcome you..");

		String name = null;
		name.length();

		return "welcome";
	}

	// Controller Exception handler..
	@ExceptionHandler(value = NullPointerException.class)
	public String handleNullPointerException(Model model) {
		model.addAttribute("errMsg", "Some problem occured. Please try again sometime..");
		return "error";
	}

}
