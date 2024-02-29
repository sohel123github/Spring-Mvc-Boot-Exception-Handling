package com.exceptionhandling.service;

import org.springframework.stereotype.Service;

import com.exceptionhandling.exception.NoBookFoundException;

@Service
public class BookServiceImpl implements BookService {

	@Override
	public Double findPriceById(String bookId) {
		if (bookId.equals("B101")) {
			return 450.00;
		} else {
			throw new NoBookFoundException("No Book Found With Given ID");
		}
	}

}
