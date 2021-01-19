package com.bookapp.model.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.model.dao.Book;
import com.bookapp.model.service.BookService;

//REST
@RestController // = @controller + @ResponseBody
public class BookRestController {
	
	private BookService bookService;
	
	@Autowired
	public BookRestController(BookService bookService) {
		this.bookService = bookService;
	}

	@GetMapping(path="book" , produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Book> getBook() {
		List<Book> books = bookService.getAllBooks();
		return books;
	}
	
	@GetMapping(path="book/{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
	public Book getBookById(@PathVariable(name = "id")int id) {
		return bookService.getBookById(id);
	}
	
	//add
	@PostMapping(path="book", 
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public Book addBook(@RequestBody Book book) {
		return bookService.addBook(book);
	}
	//update
	@PutMapping(path="book/{id}", 
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public Book updateBook(@PathVariable(name = "id")int id,@RequestBody Book book ) {
		return bookService.updateBook(id, book);
	}
	//delete
	@DeleteMapping(path="book/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Book delBook(@PathVariable(name = "id")int id) {
		return bookService.deleteBook(id);
	}

}
