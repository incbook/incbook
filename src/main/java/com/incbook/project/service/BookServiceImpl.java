package com.incbook.project.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.incbook.project.domain.BookVO;
import com.incbook.project.persistence.BookDAO;

@Service
public class BookServiceImpl implements BookService {
	@Inject
	private BookDAO dao;
	
	@Override
	public BookVO bookInfo(BookVO vo) throws Exception {
		return dao.bookInfo(vo);
	}

}
