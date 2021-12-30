package com.mappings.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "many_book_details")
public class Book {
	@Id
	@SequenceGenerator(name = "SEQ_MANY_BOOK_ID", sequenceName = "SEQ_MANY_BOOK_ID", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_MANY_BOOK_ID")
	@Column(name = "book_Nid")
	private int booknId;
	@Column(name = "book_name")
	private String bookName;
	@Column(name = "book_author")
	private String bookAuthor;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "bookEntity", fetch = FetchType.EAGER)
//	@JoinColumn(name = "book_refId", referencedColumnName = "book_Nid")
	private Set<Pages> pages;

	public int getBooknId() {
		return booknId;
	}

	public void setBooknId(int booknId) {
		this.booknId = booknId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public Set<Pages> getPages() {
		return pages;
	}

	public void setPages(Set<Pages> pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Book [booknId=" + booknId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", pages=" + pages
				+ "]";
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int booknId, String bookName, String bookAuthor, Set<Pages> pages) {
		super();
		this.booknId = booknId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.pages = pages;
	}

}
