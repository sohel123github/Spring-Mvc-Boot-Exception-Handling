package com.exceptionhandling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exceptionhandling.service.BookServiceImpl;

@Controller
public class BookController {

	@Autowired
	BookServiceImpl bookServiceImpl;

	@RequestMapping("/book/{bookId}")
	public String getBookById(@PathVariable String bookId, Model model) {
		Double bookPrice = bookServiceImpl.findPriceById(bookId);
		model.addAttribute("price", "Book Price : " + bookPrice);
		return "displayPrice";

	}

}
