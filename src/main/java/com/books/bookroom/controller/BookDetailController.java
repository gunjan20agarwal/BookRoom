package com.books.bookroom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.bookroom.service.BookDetailService;
import com.books.bookroom.model.BookDetail;

@RestController
public class BookDetailController {
	
	@Autowired
	private BookDetailService bookDetailService;
	
	@PostMapping("/bookDetail")
    public ResponseEntity<BookDetail> add(@RequestBody BookDetail bookDetail) {

             		bookDetailService.insert(bookDetail); 
            		return new ResponseEntity<BookDetail>(HttpStatus.OK);
    }
	
	@GetMapping("/bookDetail")
    public ResponseEntity<BookDetail> getBook() { 
            		return new ResponseEntity(bookDetailService.getBooks(), HttpStatus.OK);
    }
	

}
