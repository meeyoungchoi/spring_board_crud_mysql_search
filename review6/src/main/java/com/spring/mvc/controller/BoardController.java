package com.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		return "board/write";
	}
	
	
	@PostMapping("/board/write")
	public String insert(BoardVO board) {
		System.out.println("/board/write: GET");
		System.out.println(board.toString());
		service.insert(board);
		return "redirect:/board/list";
	}
	
	@GetMapping("/board/content/{boardNo}")
	public String content(@PathVariable int boardNo, Model model) {
		System.out.println("/board/content: GET");
		System.out.println("parameter: " + boardNo);
		System.out.println(service.detail(boardNo));
		model.addAttribute("board", service.detail(boardNo));
		return "board/content";
	}
	
	@GetMapping("/board/modify/{boardNo}")
	public String edit(@PathVariable int boardNo, Model model) {
		System.out.println("/board/modify: GET");
		System.out.println("parameter: " + boardNo);
		System.out.println(service.detail(boardNo));
		model.addAttribute("board", service.detail(boardNo));
		return "board/modify";
	}
	
	@PostMapping("/board/modify")
	public String update(BoardVO board) {
		System.out.println("/board/modify: POST");
		System.out.println(board.toString());
		service.update(board);
		return "redirect:/board/content/" + board.getBoardNo();
	  //return "redirect:/board/content?boardNo=${board.boardNo}";//안되는이유?
	}
	
	
	@GetMapping("/board/delete/{boardNo}")
	public String delete(@PathVariable int boardNo) {
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
