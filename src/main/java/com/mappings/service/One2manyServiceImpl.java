package com.mappings.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mappings.model.Book;
import com.mappings.model.Pages;
import com.mappings.repositary.One2manyBookRepositary;
import com.mappings.repositary.One2manyPagesRepositary;

@Service
public class One2manyServiceImpl implements One2manyService {

	@Autowired
	private One2manyBookRepositary bookRepositary;

	@Autowired
	private One2manyPagesRepositary pagesRepositary;

	@Override
	public void saveInData(List<Book> book) throws Exception {
		bookRepositary.saveAll(book);
	}

	@Override
	public List<Book> getData() throws Exception {
		return (List<Book>) bookRepositary.findAll();
	}

	@Override
	public void saveInDataManytoOne(List<Pages> pages) {
		pagesRepositary.saveAll(pages);
	}

	@Override
	public List<Pages> getDataManytoOne() {
		return (List<Pages>) pagesRepositary.findAll();
	}

}
