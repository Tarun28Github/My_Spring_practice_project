package com.springbootrest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootrest.dao.BookRepository;
import com.springbootrest.entity.Books;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	/*
	 * private static List<Books> list = new ArrayList<>();
	 * 
	 * static {
	 * 
	 * list.add(new Books(1,"java","Tarun")); list.add(new
	 * Books(2,"python","Ayush")); list.add(new Books(3,"javascript","Manish"));
	 * 
	 * }
	 */

	public List<Books> getAllBooks() {
		List<Books> all = (List<Books>)this.bookRepository.findAll();
		return all;
	}

	public Books getBookById(int id) {
		/* Books b = list.stream().filter(e -> e.getId() == id).findFirst().get(); */
		Books byId = this.bookRepository.findById(id);
		return byId;
	}

	public Books postBook(Books book) {
		/* list.add(book); */
		
		Books save = this.bookRepository.save(book);
		
		return save;
	}

	public void deleteBook(int id) {
		/*
		 * list = list.stream().filter(e -> e.getId() !=
		 * id).collect(Collectors.toList());
		 */
		this.bookRepository.deleteById(id);
	}

	public Books updateBook(Books book, int id) {

		/*
		 * list = list.stream().peek(e -> { if (e.getId() == id) {
		 * e.setAuthor(book.getAuthor()); e.setName(book.getName()); }
		 * }).collect(Collectors.toList());
		 */
		book.setId(id);
		Books save = this.bookRepository.save(book);
		return save;
	}

}
