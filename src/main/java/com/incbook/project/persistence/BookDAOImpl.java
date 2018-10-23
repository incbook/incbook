package com.incbook.project.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.incbook.project.domain.BookVO;

@Repository
public class BookDAOImpl implements BookDAO{
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "my_incbook.mapper.bookMapper";
	
	@Override
	public BookVO bookInfo(BookVO vo) throws Exception {

		return sqlSession.selectOne(namespace+".bookInfo", vo);
	}

}
