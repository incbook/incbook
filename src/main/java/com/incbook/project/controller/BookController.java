package com.incbook.project.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.incbook.project.domain.BookVO;
import com.incbook.project.service.BookService;

@Controller
@RequestMapping("/book/*")
public class BookController {
	
	@Inject
	private BookService service;

	@RequestMapping(value = "/information", method = RequestMethod.POST)
	public void bookInfo(BookVO vo, Model model) throws Exception {
		
		BookVO var = service.bookInfo(vo);
		
		model.addAttribute("bookInfo",var);
		
	}
	@RequestMapping(value = "/information", method = RequestMethod.GET)
	public void bookInfo() throws Exception {

	
	}
}









