package com.cg.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.BookRepository;
import com.cg.dto.Books;



@Service
public class BookService {

	@Autowired
	BookRepository bookRepo;

	public Books searchBookByUUID(Integer uuid) {
		Optional<Books> book =  bookRepo.findById(uuid);
		Books books = book.get();
		return books;
		
	}

	public List<Books> searchBookBytitle(String title) {
		List<Books> books = new ArrayList<>();
		for (Books book : bookRepo.findAll()) {
			if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
				books.add(book);
			}
		}
		
		List<Books> sortedBooks = books.stream().sorted((b1,b2)->b1.getTitle().compareTo(b2.getTitle())).collect(Collectors.toList());
		return sortedBooks;
	}

	public List<Books> searchBookByAuthor(String author) {
		List<Books> books = new ArrayList<>();
		for (Books book : bookRepo.findAll()) {
			if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
				books.add(book);
			}
		}	
		return books;
		
	}

	public List<Books> searchBookByCategory(String category) {
		List<Books> books = new ArrayList<>();
		for (Books book : bookRepo.findAll()) {
			if (book.getCategory().toLowerCase().contains(category.toLowerCase())) {
				books.add(book);
			}
		}	
		return books;
		
	}
}
