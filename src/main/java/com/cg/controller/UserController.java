package com.cg.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.dto.Books;
import com.cg.service.BookService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping(value="/searchBook/{uuid}")
	public String searchBookByUUID(@PathVariable Integer uuid,Model model) {
		Books book = bookService.searchBookByUUID(uuid);
		if(book==null) {
			model.addAttribute("errormsg","id is invalid"+uuid);
			return "ErrorPage";
		}
		else {
		model.addAttribute("book",book);
		return "SearchBookByUUID";
		}
	}
	
	@GetMapping(value="/searchBook/{title}")
	public String searchBookBytitle(@PathVariable String title,Model model) {
		List<Books> book = bookService.searchBookBytitle(title);
		
		model.addAttribute("book",book);
		return "SearchBookBytitle";
	}
	
	@GetMapping(value="/searchBook/{author}")
	public String searchBookByAuthor(@PathVariable String author,Model model) {
		List<Books> book = bookService.searchBookByAuthor(author);
		
		model.addAttribute("book",book);
		return "SearchBookByAuthor";
	}
	
	@GetMapping(value="/searchBook/{category}")
	public String searchBookByCategory(@PathVariable String category,Model model) {
		List<Books> book = bookService.searchBookByCategory(category);
		
		model.addAttribute("book",book);
		return "SearchBookByCategory";
	}
	
	
	
}
