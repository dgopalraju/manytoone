package com.mappings.repositary;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mappings.model.Book;


@Repository
public interface One2manyBookRepositary extends CrudRepository<Book, Integer> {

}
