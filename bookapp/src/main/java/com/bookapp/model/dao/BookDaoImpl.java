package com.bookapp.model.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookapp.model.dao.exceptions.BookNotFoundException;

@Repository
public class BookDaoImpl  implements BookDao{

	
	private EntityManager em;
	
	
	@Autowired
	public BookDaoImpl(EntityManager em) {
		this.em = em;
	}

	@Override
	public List<Book> getAllBooks() {
		List<Book>books=em.createQuery("select b from Book b", Book.class).getResultList();
		return books;
	}

	@Override
	public Book getBookById(int id) {
		Book book = em.find(Book.class, id);
		if(book==null)
			throw new BookNotFoundException("book with id:" +id + "is not found");
		return book;
	}

	@Override
	public Book addBook(Book book) {
		em.persist(book);
		return book;
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		return null;
	}

	@Override
	public Book updateBook(int bookId, Book book) {
		Book bookToUpdate=getBookById(bookId);
		bookToUpdate.setPrice(book.getPrice());
		em.merge(bookToUpdate);
		return bookToUpdate;
	}

	@Override
	public Book deleteBook(int bookId) {
		Book bookToDelete=getBookById(bookId);
		em.remove(bookToDelete);
		return null;
	}

}
