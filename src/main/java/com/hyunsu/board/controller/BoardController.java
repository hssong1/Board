package com.hyunsu.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hyunsu.board.model.Board;
import com.hyunsu.board.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping(value="/now")
	public String now(Model model) throws Exception{
		
		model.addAttribute("now", boardService.now());
		return "now";
	}
	
	@RequestMapping(value="/test")
	public String test(Model model) {
		model.addAttribute("test", "테스트 성공!");
		return "test";
	}
	
	@RequestMapping(value="/boardList")
	public String boardList(Model model) throws Exception{
		List <Board> list = boardService.boardList();
		model.addAttribute("list", list);
		return "boardList";
	}
	
}
