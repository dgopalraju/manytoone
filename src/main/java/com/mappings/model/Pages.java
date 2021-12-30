package com.mappings.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "many_Pages_Details")
public class Pages {
	@Id
	@SequenceGenerator(name = "SEQ_MANY_PAGE_ID", sequenceName = "SEQ_MANY_PAGE_ID", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_MANY_PAGE_ID")
	@Column(name = "page_Id")
	private int pageId;
	@Column(name = "page_Number")
	private int pageNumber;
	@Column(name = "page_Content")
	private String pageContent;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "book_refId", referencedColumnName = "book_Nid")
	private Book bookEntity;

	public int getPageId() {
		return pageId;
	}

	public void setPageId(int pageId) {
		this.pageId = pageId;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getPageContent() {
		return pageContent;
	}

	public void setPageContent(String pageContent) {
		this.pageContent = pageContent;
	}

	public Book getBookEntity() {
		return bookEntity;
	}

	public void setBookEntity(Book bookEntity) {
		this.bookEntity = bookEntity;
	}

	@Override
	public String toString() {
		return "Pages [pageId=" + pageId + ", pageNumber=" + pageNumber + ", pageContent=" + pageContent
				+ ", bookEntity=" + bookEntity + "]";
	}

	public Pages() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pages(int pageId, int pageNumber, String pageContent, Book bookEntity) {
		super();
		this.pageId = pageId;
		this.pageNumber = pageNumber;
		this.pageContent = pageContent;
		this.bookEntity = bookEntity;
	}

}
