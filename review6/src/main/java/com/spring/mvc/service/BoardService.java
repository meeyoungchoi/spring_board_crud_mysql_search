package com.spring.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.model.BoardVO;
import com.spring.mvc.repository.IBoardRepository;

@Service
public class BoardService implements IBoardService {
	
	@Autowired
	private IBoardRepository repository;
	

	@Override
	public void insert(BoardVO board) {
		repository.insert(board);
	}


	@Override
	public List<BoardVO> getBoardList() {
		return repository.getBoardList();
	}


	@Override
	public BoardVO detail(int boardNo) {
		return repository.detail(boardNo);
	}


	@Override
	public void update(BoardVO board) {
		repository.update(board);
		
	}


	@Override
	public void delete(int boardNo) {
		repository.delete(boardNo);
		
	}


	@Override
	public List<BoardVO> search(String keyword) {
		keyword = "%" + keyword + "%";
		return repository.search(keyword);
	}

}
