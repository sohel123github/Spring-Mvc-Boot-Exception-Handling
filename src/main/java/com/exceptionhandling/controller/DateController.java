package com.exceptionhandling.controller;

import java.time.LocalDate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateController {

	@RequestMapping("/date")
	public String displayDate(Model model) {
		LocalDate currentDate = LocalDate.now();
		model.addAttribute("dateMsg", "Today's Date is ::" + currentDate);

		String s = null;
		s.length();

		return "dataDisplay";
	}

}
