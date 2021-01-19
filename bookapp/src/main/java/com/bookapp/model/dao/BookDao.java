package com.bookapp.model.dao;

import java.util.*;

public interface BookDao {
	public List<Book> getAllBooks();
	public Book getBookById(int id);
	public Book addBook(Book book);
	public List<Book> getBookByTitle(String title);
	public Book updateBook(int bookId, Book book);
	public Book deleteBook(int bookId);
	

}
