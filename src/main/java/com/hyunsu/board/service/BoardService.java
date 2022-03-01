package com.hyunsu.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyunsu.board.mapper.BoardMapper;
import com.hyunsu.board.model.Board;

@Service
public class BoardService {
	
	@Autowired
	BoardMapper boardMapper;
	
	public String now() throws Exception{
		return boardMapper.now();
	}
	
	public List<Board> boardList() throws Exception{
		return boardMapper.boardList();
	}
}
