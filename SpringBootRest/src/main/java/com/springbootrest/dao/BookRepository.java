package com.springbootrest.dao;

import org.springframework.data.repository.CrudRepository;

import com.springbootrest.entity.Books;

public interface BookRepository  extends CrudRepository<Books, Integer>{
   public Books findById(int id);
}
