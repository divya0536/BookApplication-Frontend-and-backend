package com.bookapp;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.model.dao.Book;
import com.bookapp.model.service.BookService;

@SpringBootApplication
public class BookappApplication implements CommandLineRunner{
	
	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(BookappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("-----------------");
		Book book1= new Book("think and grow rich", "NH", 200.00, "abc", new Date());
		Book book2= new Book("screte", "Rs", 230.00, "prq", new Date());
		
		bookService.addBook(book1);
		bookService.addBook(book2);
		
		System.out.println("-----------------");
	}

}
