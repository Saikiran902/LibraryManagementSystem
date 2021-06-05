package com.cg.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Books {
	@Id
	@Column(name="book_UUID")
	private Integer bookUUId;
	@Column(name="book_title")
	private String title;
	@Column(name="book_author")
	private String author;
	@Column(name="book_category")
	private String category;
	@Column(name="book_status")
	private String status;
	@Column(name="return_date")
	private Date returnDate;
	
	public Integer getBookUUId() {
		return bookUUId;
	}
	public void setBookUUId(Integer bookUUId) {
		this.bookUUId = bookUUId;
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public Books() {
		
	}
	public Books(Integer bookUUId, String title, String author, String category, String status, Date returnDate) {
		super();
		this.bookUUId = bookUUId;
		this.title = title;
		this.author = author;
		this.category = category;
		this.status = status;
		this.returnDate = returnDate;
	}
	@Override
	public String toString() {
		return "Books [bookUUId=" + bookUUId + ", title=" + title + ", author=" + author + ", category=" + category
				+ ", status=" + status + ", returnDate=" + returnDate + "]";
	}
	
	
	
	
}
