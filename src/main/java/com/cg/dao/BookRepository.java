package com.cg.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.dto.Books;

@Repository
public interface BookRepository extends CrudRepository<Books, Integer> {

}
