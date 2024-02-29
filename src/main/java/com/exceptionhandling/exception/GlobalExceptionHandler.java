package com.exceptionhandling.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = NullPointerException.class)
	public String nullPointerHandler(Model model) {
		model.addAttribute("exceptionMsg", "Here is null Pointer Exception..");
		return "dateerror";
	}

	@ExceptionHandler(value = NoBookFoundException.class)
	public String noBookFoundException(Model model) {
		model.addAttribute("NoBookError", "Sorry! No Book is available with such Id");
		return "displayPriceError";
	}
}
