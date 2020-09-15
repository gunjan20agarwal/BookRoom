package com.books.bookroom.model;
// Generated 15 Sep, 2020 4:34:00 PM by Hibernate Tools 5.2.12.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * BookDetail generated by hbm2java
 */
@Entity
@Table(name = "book_detail", catalog = "bookroom")
public class BookDetail implements java.io.Serializable {

	private int bookId;
	private String bookName;
	private String author;
	private String publisher;
	private String category;
	private String subCategory;
	private String subject;
	private String genre;
	private String bookEdition;
	private String price;
	private Date dateOfPublication;
	private int editionId;
	private int titileId;

	public BookDetail() {
	}

	public BookDetail(int bookId, String bookName, String category, String subCategory, int editionId, int titileId) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.category = category;
		this.subCategory = subCategory;
		this.editionId = editionId;
		this.titileId = titileId;
	}

	public BookDetail(int bookId, String bookName, String author, String publisher, String category, String subCategory,
			String subject, String genre, String bookEdition, String price, Date dateOfPublication, int editionId,
			int titileId) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
		this.category = category;
		this.subCategory = subCategory;
		this.subject = subject;
		this.genre = genre;
		this.bookEdition = bookEdition;
		this.price = price;
		this.dateOfPublication = dateOfPublication;
		this.editionId = editionId;
		this.titileId = titileId;
	}

	@Id

	@Column(name = "Book_ID", unique = true, nullable = false)
	public int getBookId() {
		return this.bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	@Column(name = "BookName", nullable = false, length = 100)
	public String getBookName() {
		return this.bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Column(name = "Author", length = 45)
	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Column(name = "Publisher", length = 45)
	public String getPublisher() {
		return this.publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Column(name = "Category", nullable = false, length = 45)
	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Column(name = "SubCategory", nullable = false, length = 45)
	public String getSubCategory() {
		return this.subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	@Column(name = "Subject", length = 45)
	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Column(name = "Genre", length = 45)
	public String getGenre() {
		return this.genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Column(name = "BookEdition", length = 45)
	public String getBookEdition() {
		return this.bookEdition;
	}

	public void setBookEdition(String bookEdition) {
		this.bookEdition = bookEdition;
	}

	@Column(name = "Price", length = 45)
	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DateOfPublication", length = 19)
	public Date getDateOfPublication() {
		return this.dateOfPublication;
	}

	public void setDateOfPublication(Date dateOfPublication) {
		this.dateOfPublication = dateOfPublication;
	}

	@Column(name = "Edition_ID", nullable = false)
	public int getEditionId() {
		return this.editionId;
	}

	public void setEditionId(int editionId) {
		this.editionId = editionId;
	}

	@Column(name = "Titile_ID", nullable = false)
	public int getTitileId() {
		return this.titileId;
	}

	public void setTitileId(int titileId) {
		this.titileId = titileId;
	}

}
