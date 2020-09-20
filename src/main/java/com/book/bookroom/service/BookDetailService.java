package com.book.bookroom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.book.bookroom.repo.BookDetailRepo;
import com.books.bookroom.model.BookDetail;


@Service
public class BookDetailService {
	
	@Autowired
	private BookDetailRepo bookDetailRepo;
	
	public void insert(BookDetail bookDetail)
	{
		bookDetailRepo.save(bookDetail);
	}
	
	public List<BookDetail> getBooks()
	{
		return bookDetailRepo.findAll();
	}

}
