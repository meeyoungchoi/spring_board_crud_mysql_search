package com.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.mvc.model.BoardVO;
import com.spring.mvc.service.IBoardService;


@Controller
public class BoardController {
	
	@Autowired
	private IBoardService service;

	
	@GetMapping("/board/list")
	public String getList(Model model) {
		System.out.println("/board/list: GET");
		model.addAttribute("boards", service.getBoardList());
		return "board/list";
	}
	
	
	@GetMapping("/board/write")
	public String write() {
		return "board/write-form";
	}
	
	
	@PostMapping("/board/write")
	public String insert(BoardVO board) {
		System.out.println("/board/write: GET");
		System.out.println(board.toString());
		service.insert(board);
		return "redirect:/board/list";
	}
	
	@GetMapping("/board/show")
	public String show(int boardNo, Model model) {
		System.out.println("/board/show: GET");
		System.out.println("parameter: " + boardNo);
		System.out.println(service.detail(boardNo));
		model.addAttribute("board", service.detail(boardNo));
		return "board/show";
	}
	
	@GetMapping("/board/edit")
	public String edit(int boardNo, Model model) {
		System.out.println("/board/edit: GET");
		System.out.println("parameter: " + boardNo);
		System.out.println(service.detail(boardNo));
		model.addAttribute("board", service.detail(boardNo));
		return "board/edit";
	}
	
	@PostMapping("/board/update")
	public String update(BoardVO board, Model model) {
		System.out.println("/board/update: POST");
		System.out.println(board.toString());
		service.update(board);
		model.addAttribute("boardNo", board.getBoardNo());
	    return "redirect:/board/show";
	}
	
	
	@GetMapping("/board/delete")
	public String delete(int boardNo) {
		System.out.println("/board/delete: GET");
		System.out.println("parameter: " + boardNo);
		service.delete(boardNo);
		return "redirect:/board/list";
	}
	
	@PostMapping("/board/search")
	public String search(String keyword, Model model) {
		System.out.println("/board/search: POST");
		System.out.println("parameter: " + keyword);
		model.addAttribute("boards", service.search(keyword));
		return "board/list";
	}
	
}
