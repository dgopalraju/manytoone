package com.mappings.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mappings.model.Book;
import com.mappings.model.Pages;
import com.mappings.service.One2manyService;

@RestController
public class One2manyController {
	private static final Logger log = LoggerFactory.getLogger(One2manyController.class);
	@Autowired
	private One2manyService serviceLayer;

	@PostMapping("/onetoManySaveing")
	public ResponseEntity<String> saveInDatabase(@RequestBody List<Book> book) throws Exception {
		log.info("All Details===>" + book.toString());
		serviceLayer.saveInData(book);
		return new ResponseEntity<>("Data inserted successfully", HttpStatus.CREATED);
	}

	@GetMapping("/gettingAllDetails")
	public ResponseEntity<List<Book>> getAllData() throws Exception {
		return new ResponseEntity<List<Book>>(serviceLayer.getData(), HttpStatus.OK);
	}
	
	@PostMapping("/manytoOneSaveing")
	public ResponseEntity<String> saveInDatabaseManytoOne(@RequestBody List<Pages> pages) throws Exception {
		log.info("All Details===>" + pages.toString());
		serviceLayer.saveInDataManytoOne(pages);
		return new ResponseEntity<>("Data inserted successfully", HttpStatus.CREATED);
	}

	@GetMapping("/manytoOneAllDetails")
	public ResponseEntity<List<Pages>> getAllDataManytoOne() throws Exception {
		return new ResponseEntity<List<Pages>>(serviceLayer.getDataManytoOne(), HttpStatus.OK);
	}
}
