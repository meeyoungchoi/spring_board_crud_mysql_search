package com.spring.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.model.BoardVO;
import com.spring.mvc.repository.IBoardMapper;

@Service
public class BoardService implements IBoardService {
	
	@Autowired
	private IBoardMapper mapper;
	

	@Override
	public void insert(BoardVO board) {
		mapper.insert(board);
	}


	@Override
	public List<BoardVO> getBoardList() {
		return mapper.getBoardList();
	}


	@Override
	public BoardVO detail(int boardNo) {
		return mapper.detail(boardNo);
	}


	@Override
	public void update(BoardVO board) {
		mapper.update(board);
		
	}


	@Override
	public void delete(int boardNo) {
		mapper.delete(boardNo);
		
	}


	@Override
	public List<BoardVO> search(String keyword) {
		keyword = "%" + keyword + "%";
		return mapper.search(keyword);
	}

}
