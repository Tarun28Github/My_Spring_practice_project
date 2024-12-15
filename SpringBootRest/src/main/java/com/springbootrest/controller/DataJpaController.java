package com.springbootrest.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.springbootrest.entity.Books;
import com.springbootrest.service.BookService;

@RestController
public class DataJpaController {
	
	@Autowired
	private BookService service;
	

	public DataJpaController(BookService service) {
		super();
		this.service = service;
	}

	@GetMapping(value="/books")
	public ResponseEntity<List<Books>> getBooks() {
		List<Books> blist = null ;
		try {
			 blist = this.service.getAllBooks();
			if(blist.size()<=0) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			
		}catch(Exception e){
			e.printStackTrace();			
		}
		
		return ResponseEntity.of(Optional.of(blist));
		
	}
	
	@GetMapping("/books/{id}")
	public ResponseEntity<Books> getBooks(@PathVariable("id") int id) {
		Books book=null;
		try {
		book = this.service.getBookById(id);
		if(book == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.of(Optional.of(book));
		
	}
	
	@PostMapping("/books")
	public ResponseEntity<Books> postBook(@RequestBody Books book) {
		Books b = null;
		   try{
			 b=  this.service.postBook(book);
			 
		   }catch(Exception e){
			   e.printStackTrace();  
			   ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		   }
		 
		   return ResponseEntity.status(HttpStatus.CREATED).body(b);
	}
	
	@DeleteMapping("/books/{id}")
	public ResponseEntity<Void> deleteBook(@PathVariable("id") int id) {
		try {
			this.service.deleteBook(id);
			
			
		}catch(Exception e) {
			e.printStackTrace();
			ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
	
	@PutMapping("/books/{id}")
	public ResponseEntity<Books> updateBook(@RequestBody Books book, @PathVariable("id")int id) {
		
		Books b = null;
		try{
		  b=this.service.updateBook(book, id);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		return ResponseEntity.of(Optional.of(b));
	}
}
