package com.incbook.project.persistence;

import com.incbook.project.domain.BookVO;

public interface BookDAO {

	public BookVO bookInfo(BookVO vo) throws Exception;


}
