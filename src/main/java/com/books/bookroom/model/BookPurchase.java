package com.books.bookroom.model;
// Generated 19 Sep, 2020 2:32:54 PM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * BookPurchase generated by hbm2java
 */
@Entity
@Table(name = "book_purchase", catalog = "bookroom")
public class BookPurchase implements java.io.Serializable {

	private int editionId;
	private String bookEdition;
	private String dateOfPurchase;
	private String price;
	private String dateOfPublication;
	private String noOfBooksPurchased;
	private String noOfBooksAvailable;
	private String titleId;

	public BookPurchase() {
	}

	public BookPurchase(int editionId) {
		this.editionId = editionId;
	}

	public BookPurchase(int editionId, String bookEdition, String dateOfPurchase, String price,
			String dateOfPublication, String noOfBooksPurchased, String noOfBooksAvailable, String titleId) {
		this.editionId = editionId;
		this.bookEdition = bookEdition;
		this.dateOfPurchase = dateOfPurchase;
		this.price = price;
		this.dateOfPublication = dateOfPublication;
		this.noOfBooksPurchased = noOfBooksPurchased;
		this.noOfBooksAvailable = noOfBooksAvailable;
		this.titleId = titleId;
	}

	@Id

	@Column(name = "Edition_ID", unique = true, nullable = false)
	public int getEditionId() {
		return this.editionId;
	}

	public void setEditionId(int editionId) {
		this.editionId = editionId;
	}

	@Column(name = "BookEdition", length = 45)
	public String getBookEdition() {
		return this.bookEdition;
	}

	public void setBookEdition(String bookEdition) {
		this.bookEdition = bookEdition;
	}

	@Column(name = "DateOfPurchase", length = 45)
	public String getDateOfPurchase() {
		return this.dateOfPurchase;
	}

	public void setDateOfPurchase(String dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	@Column(name = "Price", length = 45)
	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Column(name = "DateOfPublication", length = 45)
	public String getDateOfPublication() {
		return this.dateOfPublication;
	}

	public void setDateOfPublication(String dateOfPublication) {
		this.dateOfPublication = dateOfPublication;
	}

	@Column(name = "NoOfBooksPurchased", length = 45)
	public String getNoOfBooksPurchased() {
		return this.noOfBooksPurchased;
	}

	public void setNoOfBooksPurchased(String noOfBooksPurchased) {
		this.noOfBooksPurchased = noOfBooksPurchased;
	}

	@Column(name = "NoOfBooksAvailable", length = 45)
	public String getNoOfBooksAvailable() {
		return this.noOfBooksAvailable;
	}

	public void setNoOfBooksAvailable(String noOfBooksAvailable) {
		this.noOfBooksAvailable = noOfBooksAvailable;
	}

	@Column(name = "Title_ID", length = 45)
	public String getTitleId() {
		return this.titleId;
	}

	public void setTitleId(String titleId) {
		this.titleId = titleId;
	}

}
