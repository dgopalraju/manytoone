package com.mappings.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mappings.model.Book;
import com.mappings.model.Pages;


public interface One2manyService {

	void saveInData(List<Book> book) throws Exception;

	List<Book> getData() throws Exception;

	void saveInDataManytoOne(List<Pages> pages);

	List<Pages> getDataManytoOne();

}
