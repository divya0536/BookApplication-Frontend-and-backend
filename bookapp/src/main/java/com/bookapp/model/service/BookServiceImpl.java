package com.bookapp.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bookapp.model.dao.Book;
import com.bookapp.model.dao.BookDao;

@Service
@Transactional
public class BookServiceImpl implements BookService{

	
	private BookDao bookdao;
	
	@Autowired
	public BookServiceImpl(BookDao bookdao) {
		this.bookdao = bookdao;
	}

	@Override
	public List<Book> getAllBooks() {
		return bookdao.getAllBooks();
	}

	@Override
	public Book getBookById(int id) {
		return bookdao.getBookById(id);
	}

	@Override
	public Book addBook(Book book) {
		return bookdao.addBook(book);
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		return bookdao.getBookByTitle(title);
	}

	@Override
	public Book updateBook(int bookId, Book book) {
		return bookdao.updateBook(bookId, book);
	}

	@Override
	public Book deleteBook(int bookId) {
		return bookdao.deleteBook(bookId);
	}

}
