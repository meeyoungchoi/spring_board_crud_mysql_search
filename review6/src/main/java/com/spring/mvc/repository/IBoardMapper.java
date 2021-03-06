package com.spring.mvc.repository;

import java.util.List;

import com.spring.mvc.model.BoardVO;

public interface IBoardMapper {
	void insert(BoardVO board);
	
	List<BoardVO> getBoardList();
	
	BoardVO detail(int boardNo);
	
	void update(BoardVO board);
	
	void delete(int boardNo);
	
	List<BoardVO> search(String keyword);
	
}

