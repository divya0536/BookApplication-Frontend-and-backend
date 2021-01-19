package com.bookapp.model.dao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name = "book_table")
public class Book {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "book_title", nullable = false, length = 50)
	private String title;
	@Column(name = "book_author", nullable = false, length = 50)
	private String author;
	@Column(name = "book_price", nullable = false)
	private Double price;
	@Column(name = "book_pubname", nullable = false, length = 50)
	private String pubName;
	@Column(name = "book_pubDate", nullable = false, length = 50)
	@Temporal(TemporalType.DATE)
	private Date pubDate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getPubName() {
		return pubName;
	}
	public void setPubName(String pubName) {
		this.pubName = pubName;
	}
	public Date getPubDate() {
		return pubDate;
	}
	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}
	
	
	public Book() {}
	public Book(Integer id, String title, String author, Double price, String pubName, Date pubDate) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
		this.pubName = pubName;
		this.pubDate = pubDate;
	}
	
	public Book(String title, String author, Double price, String pubName, Date pubDate) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.pubName = pubName;
		this.pubDate = pubDate;
	}
	
	
	

}
