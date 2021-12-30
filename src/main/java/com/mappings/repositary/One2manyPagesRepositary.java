package com.mappings.repositary;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.mappings.model.Pages;

@Repository
public interface One2manyPagesRepositary extends CrudRepository<Pages, Integer> {

}
